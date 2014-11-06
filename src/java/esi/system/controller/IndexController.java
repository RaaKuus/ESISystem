/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Bruno
 */

@Controller
public class IndexController {
    
    @RequestMapping(value = "/")
    public String index(Model model){
        System.out.println(model);
        System.out.println("Acessando index");
        return "index";
    }
    
}
