/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import esi.system.model.Aluno;
import esi.system.model.CondicoesSaude;
import esi.system.model.Matricula;
import esi.system.model.MatriculaWrapper;
import esi.system.model.NecessidadesEspeciais;
import esi.system.model.Observacoes;
import esi.system.service.AlunoService;
import esi.system.service.CondicoesSaudeService;
import esi.system.service.NecessidadesEspeciaisService;
import esi.system.service.ObservacoesService;
import esi.system.utils.MatriculaBuilder;
import esi.system.utils.ResultJS;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bruno
 */
@Controller
public class MatriculaController {
    private final boolean debug = true;
    
    @Autowired
    private AlunoService alunoService;
    
    @Autowired
    private NecessidadesEspeciaisService necessidadesEspeciaisService;
    
    @Autowired
    private CondicoesSaudeService condicoesSaudeService;
    
    @Autowired
    private ObservacoesService observacoesService;
    
    @RequestMapping(value="/matricula/view.action")
    public @ResponseBody Map<String, ? extends Object> view(@RequestParam int start, @RequestParam int limit) throws Exception {
        ResultJS<Matricula> resultMat = new ResultJS<>();
        
        try{
            List<Matricula> matriculas = new ArrayList<>();
            
            List<Aluno> alunos = alunoService.getViewList(start, limit);
            List<NecessidadesEspeciais> necessidadesEspeciais = necessidadesEspeciaisService.getViewList(start, limit);
            List<CondicoesSaude> condicoesSaude = condicoesSaudeService.getViewList(start, limit);
            List<Observacoes> observacoes = observacoesService.getViewList(start, limit);
            
            for(int i = 0; i < alunos.size(); i++){
               MatriculaBuilder matriculaBuilder = new MatriculaBuilder();
               matriculaBuilder.buildAluno(alunos.get(i))
                               .buildCondicoesSaude(condicoesSaude.get(i))
                               .buildNecessidadesEspeciais(necessidadesEspeciais.get(i))
                               .buildObservacoes(observacoes.get(i));
               matriculas.add(matriculaBuilder.build());
            }
            int total = alunoService.getTotal();
            return resultMat.mapOk(matriculas, total);
        }catch(Exception e){
            if(this.debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Erro ao pesquisar matriculas no banco de dados.");
        }
    }
    
    @RequestMapping(value="/matricula/create.action", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, ? extends Object> create(@RequestBody MatriculaWrapper data, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ResultJS<Matricula> result = new ResultJS<>();
        try{
            List<Matricula> matriculas = new ArrayList<>();
            Aluno aluno = data.getData().buildAluno();
            NecessidadesEspeciais necessidadesEspeciais = data.getData().buildNecessidadesEspeciais();
            CondicoesSaude condicoesSaude = data.getData().buildCondicoesSaude();
            Observacoes observacoes = data.getData().buildObservacoes();
            
            this.alunoService.save(aluno);
            this.necessidadesEspeciaisService.save(necessidadesEspeciais);
            this.condicoesSaudeService.save(condicoesSaude);
            this.observacoesService.save(observacoes);
            
            MatriculaBuilder matriculaBuilder = new MatriculaBuilder();
            matriculaBuilder.buildAluno(aluno)
                            .buildCondicoesSaude(condicoesSaude)
                            .buildNecessidadesEspeciais(necessidadesEspeciais)
                            .buildObservacoes(observacoes);
            matriculas.add(matriculaBuilder.build());
            System.out.println(matriculas.toString());
            return result.mapOk(matriculas);
        }catch(Exception e){
            if(this.debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Erro ao salvar matricula no banco de dados.");
        }
    }
    
    @RequestMapping(value="/matricula/delete.action")
    public @ResponseBody Map<String, ? extends Object> delete(@RequestBody MatriculaWrapper data) throws Exception {
        try{
            Aluno aluno = data.getData().buildAluno();
            NecessidadesEspeciais necessidadesEspeciais = data.getData().buildNecessidadesEspeciais();
            CondicoesSaude condicoesSaude = data.getData().buildCondicoesSaude();
            Observacoes observacoes = data.getData().buildObservacoes();
            
            alunoService.delete(aluno.getMatricula());
            necessidadesEspeciaisService.delete(necessidadesEspeciais.getMatricula());
            condicoesSaudeService.delete(condicoesSaude.getMatricula());
            observacoesService.delete(observacoes.getMatricula());
            
            return ResultJS.mapSuccessOnly();
        }catch(Exception e){
            if(this.debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Erro ao excluir dados do banco de dados.");
        }
    }
    
    
    
}
