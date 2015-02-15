/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import esi.system.model.CapaLivroMatriculas;
import esi.system.model.ConteudoMatricula;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bruno
 */

@Controller
public class TesteReport {
    
    @RequestMapping(value="teste/matricula.action")
    public void doAction(HttpServletRequest request, HttpServletResponse response){
        CapaLivroMatriculas capaLivroMatriculas = new CapaLivroMatriculas(
                "01", 
                "Matriculas", 
                "Centro Educacional Rodrigues e Rodrigues LTDA.", 
                "Cidade Ocidental",
                "Goiás", 
                "07.651.460/0001-29");
        
        
        
    }
    
    
    public ConteudoMatricula[] gerarMatriculas(){
        List<ConteudoMatricula> matriculas = new ArrayList<>();
        
        for(int i = 0; i < 200; i++){
            ConteudoMatricula conteudo = new ConteudoMatricula();
            conteudo.setMatricula((i < 9 ? "0":"")+i);
            conteudo.setSerie("1º ano");
            conteudo.setTurno("Matutino");
            conteudo.setNomeAluno(" Aluno com o Sobrenome nº "+i);
            conteudo.setDataNascimento(" 25 de dezembro de 2003");
            conteudo.setIdade("11 anos");
            conteudo.setNaturalidade("Brasília-DF");
            conteudo.setNomePai("Eu sou o pai do aluno nº "+i);
            conteudo.setNomeMae("Eu sou a mãe da aluno nº "+i);
            
        }
        
        return (ConteudoMatricula[]) matriculas.toArray();  
    }
}
