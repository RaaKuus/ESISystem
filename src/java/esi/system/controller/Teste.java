/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import esi.system.model.Aluno;
import esi.system.model.AlunoAnoLetivo;
import esi.system.model.AnoLetivo;
import esi.system.model.DocumentosEntregues;
import esi.system.model.Email;
import esi.system.model.Telefone;
import esi.system.model.Turma;
import esi.system.service.AlunoAnoLetivoService;
import esi.system.service.AlunoService;
import esi.system.service.AnoLetivoService;
import esi.system.service.DocumentosEntreguesService;
import esi.system.service.EmailService;
import esi.system.service.TelefoneService;
import esi.system.service.TurmaService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bruno
 */

@Controller
public class Teste {
     
    @Autowired
    private AnoLetivoService anoLetivoService;
    
    @Autowired
    private TurmaService turmaService;
    
    @Autowired
    private AlunoAnoLetivoService alunoAnoLetivoService;
    
    @Autowired
    private EmailService emailService;
    
    @Autowired
    private TelefoneService telefoneService;
    
    @Autowired
    private DocumentosEntreguesService documentosEntreguesService;
    
    @RequestMapping(value = "teste/teste.action")
    public void teste(Model model, HttpServletRequest req, HttpServletResponse response) throws IOException{
        AnoLetivo anoLetivo = new AnoLetivo();
        anoLetivo.setId(1);
        anoLetivo.setAno(1990);
        anoLetivoService.save(anoLetivo);
        PrintWriter printWriter = response.getWriter();
        
        if(anoLetivoService.getTotal() > 0){
            printWriter.append("Teste realizado, resultado: OK.");
        } else {
            printWriter.append("Teste realizado, resultado: FALHA.");
        }
    }
    
    @RequestMapping(value = "teste/turma.action")
    public void teste(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Turma turma = new Turma();
        turma.setId(1);
        turma.setAnosLetivosId(1);
        turma.setSerie("1º Ano");
        turma.setTurma("única");
        turma.setTurno('m');
        
        turmaService.save(turma);
        if(turmaService.getTotal() > 0){
            response.getWriter().append("Testando a TurmaService, resultado: OK.");
        } else {
            response.getWriter().append("Testando a TurmaService, resultado: FALHA.");
        }
    }

    @RequestMapping(value = "teste/alunoanoletivo.action")
    public void alunoAnoLetivo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        AlunoAnoLetivo alunoAnoLetivo = new AlunoAnoLetivo();
        alunoAnoLetivo.setAlunosMatricula(1);
        alunoAnoLetivo.setTurmaId(1);
        alunoAnoLetivo.setTipo("Matricula");
        
        alunoAnoLetivoService.save(alunoAnoLetivo);
        if(alunoAnoLetivoService.getTotal() > 0){
            response.getWriter().append("Testando o AlunoAnoLetivoService, resultado: OK");
        } else {
            response.getWriter().append("Testando o AlunoAnoLetivoService, resultado: FALHA.");
        }
    }
   
    @RequestMapping(value = "teste/email.action")
    public void email(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Email email = new Email();
        email.setAlunosMatricula(1);
        email.setEmail("bruno_santos_sousa@outlook.com");
        emailService.save(email);
        if(emailService.getTotal() > 0){
            response.getWriter().append("Testando o EmailService, resultado: OK");
        } else {
            response.getWriter().append("Testando o EmailService, resultado: FALHA.");
        }
    }
    
    @RequestMapping(value = "teste/telefone.action")
    public void telefone(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Telefone telefone = new Telefone();
        telefone.setId(1);
        telefone.setAlunosMatricula(1);
        telefoneService.save(telefone);
        if(telefoneService.getTotal() > 0){
            response.getWriter().append("Testando o TelefoneService, resultado: OK");
        } else {
            response.getWriter().append("Testando o TelefoneService, resultado: FALHA");
        }
    }
    
    @RequestMapping(value = "teste/documentos.action")
    public void documentos(HttpServletRequest request, HttpServletResponse response) throws IOException{
        DocumentosEntregues d = new DocumentosEntregues();
        d.setAlunosMatricula(1);
        d.setCartaoVacina("Pendente");
        d.setCertidaoNascimento("Pendente");
        d.setComprovanteResidencia("Pendente");
        d.setCpf("Pendente");
        d.setFoto("Pendente");
        d.setHistoricoEscolar("Pendente");
        d.setRg("Pendente");
        
        documentosEntreguesService.save(d);
        if(documentosEntreguesService.getTotal() > 0){
            response.getWriter().append("Testando o DocumentosEntreguesService, resultado: OK");
        } else {
            response.getWriter().append("Testando o DocumentosEntreguesService, resultado: FALHA");
        }
        
    }
    
    @Autowired
    private AlunoService alunoService;
    
    @RequestMapping(value = "teste/dump_alunos.action")
    public void dumpAlunos(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter w = response.getWriter();
        w.append("Iniciando testes de alunos, conferindo todos...");
        List<Aluno> alunos = new ArrayList<>();
        int totalNull = 0;
        for(int i = 1; i < 701; i++){
            Aluno aluno = alunoService.findById(i);
            if(aluno != null){
                alunos.add(aluno);
            } else {
                totalNull++;
                w.append("ID NULL: "+i);
            }
        }
        w.append("Total de Registros: "+alunos.size());
        w.append("Total de ID NULL's: "+totalNull);
    }
}
