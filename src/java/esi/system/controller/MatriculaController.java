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
    private boolean debug = true;
    
    @Autowired
    private AlunoService alunoService;
    
    @Autowired
    private NecessidadesEspeciaisService necessidadesEspeciaisService;
    
    @Autowired
    private CondicoesSaudeService condicoesSaudeService;
    
    @Autowired
    private ObservacoesService observacoesService;
    
    @RequestMapping(value = "matricula/teste.action")
    public String form(Model model){
        System.out.println("Matricula acessada");
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(1);
        aluno.setNome("Aluno aplicado");
        aluno.setSexo(1);
        aluno.setNaturalidade("Brasilia-DF");
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse("04/11/1994");
        } catch (ParseException ex) {
            Logger.getLogger(MatriculaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(date != null)
            aluno.setDataNascimento(new Timestamp(date.getTime()));
        aluno.setEndereco("Qd 01 lote 27 Parque Nova Friburgo A");
        aluno.setNomePai("Raimundo");
        aluno.setIdentidadePai("000.000.000-00");
        aluno.setNomeMae("Jocelina");
        aluno.setIdentidadeMae("000.000.000-00");
        aluno.setCor(2);
        try{
            date = dateFormat.parse("06/11/2014");
        }catch(ParseException ex){
            
        }
        if(date != null)
            aluno.setDataMatricula(new Timestamp(date.getTime()));
        
        alunoService.save(aluno);
        
        NecessidadesEspeciais necessidadesEspeciais = new NecessidadesEspeciais();
        necessidadesEspeciais.setMatricula(1);
        necessidadesEspeciais.setAuditiva(1);
        necessidadesEspeciais.setFisica(1);
        necessidadesEspeciais.setMental(1);
        necessidadesEspeciais.setMultipla(1);
        necessidadesEspeciais.setAltasHabilidades(1);
        necessidadesEspeciais.setCondutasTipicas(1);
        necessidadesEspeciais.setOutra(1);
        
        necessidadesEspeciaisService.save(necessidadesEspeciais);
        
        CondicoesSaude condicoesSaude = new CondicoesSaude();
        condicoesSaude.setMatricula(1);
        condicoesSaude.setVacinas(1);
        condicoesSaude.setAlergica(1);
        condicoesSaude.setAlergias("Nenhuma");
        condicoesSaude.setRemedioControlado(1);
        condicoesSaude.setRemedioIndicado("Nenhum");
        condicoesSaude.setFebre(1);
        condicoesSaude.setRemedioFebre("dipirona");
        
        condicoesSaudeService.save(condicoesSaude);
        
        Observacoes o = new Observacoes(1, "Observações");
        observacoesService.save(o);
        
        return "index";
    }
    
    @RequestMapping(value="/matricula/view.action")
    public @ResponseBody Map<String, ? extends Object> view(@RequestParam int start, @RequestParam int limit) throws Exception {
        ResultJS<Matricula> resultMat = new ResultJS<>();
        
        try{
            List<Matricula> matriculas = new ArrayList<>();
            
            List<Aluno> alunos = alunoService.getListView(start, limit);
            List<NecessidadesEspeciais> necessidadesEspeciais = necessidadesEspeciaisService.getListView(start, limit);
            List<CondicoesSaude> condicoesSaude = condicoesSaudeService.getListView(start, limit);
            List<Observacoes> observacoes = observacoesService.getListView(start, limit);
            
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
        System.out.println("Recebi request de insert!");
        ResultJS<Matricula> result = new ResultJS<>();
        System.out.println("Data de Nascimento: "+data.getData().getDataNascimento());
        System.out.println("Data de Matricula: "+data.getData().getDataMatricula());
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
            
            alunoService.delete(String.valueOf(aluno.getMatricula()));
            necessidadesEspeciaisService.delete(String.valueOf(necessidadesEspeciais.getMatricula()));
            condicoesSaudeService.delete(String.valueOf(condicoesSaude.getMatricula()));
            observacoesService.delete(String.valueOf(observacoes.getMatricula()));
            
            return ResultJS.mapSuccessOnly();
        }catch(Exception e){
            if(this.debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Erro ao excluir dados do banco de dados.");
        }
    }
    
    
    
}
