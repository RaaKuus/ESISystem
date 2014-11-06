/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import esi.system.model.Aluno;
import esi.system.service.AlunoService;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RaaKuus
 */

@Controller
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;
    
    @RequestMapping(value = "/aluno")
    public String showUserForm(Model model) throws ParseException{
        System.out.println(model);
        Aluno a = new Aluno();
        a.setMatricula(1);
        a.setNome("Nome-A");
        a.setSexo(2);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse("04/10/1994");
       
        a.setDataNascimento(new Timestamp(date.getTime()));
        alunoService.save(a);
        return "oi";
    }
}
