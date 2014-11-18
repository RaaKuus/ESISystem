/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.controller;

import esi.system.model.AnoLetivo;
import esi.system.model.AnoLetivoWrapper;
import esi.system.service.AnoLetivoService;
import esi.system.utils.ResultJS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bruno
 */
@Controller
public class AnoLetivoController {
    private static final boolean debug = true;
    @Autowired
    private AnoLetivoService anoLetivoService;
    
    @RequestMapping(value="/anoletivo/anoletivo/view.action")
    public @ResponseBody Map<String, ? extends Object> view(@RequestParam int start, @RequestParam int limit) throws Exception {
        ResultJS<AnoLetivo> result = new ResultJS<>();
        try {
            List<AnoLetivo> list = this.anoLetivoService.getListView(start, limit);
            int total = this.anoLetivoService.getTotal();
            return result.mapOk(list, total);
        } catch(Exception e) {
            if(debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Erro ao pesquisar Anos Letivos no banco de dados!");
        }
    }
    
    @RequestMapping(value="/anoletivo/anoletivo/create.action")
    public Map<String, ? extends Object> create(@RequestBody AnoLetivoWrapper data, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try{
            ResultJS<AnoLetivo> result = new ResultJS<>();
            List<AnoLetivo> list = new ArrayList<>();
            this.anoLetivoService.save(data.getData());
            list.add(data.getData());
            return result.mapOk(list);
        }catch(Exception e){
            if(debug)
                return ResultJS.mapError(e.getMessage());
            return ResultJS.mapError("Não foi possivel salvar o Ano Letivo no Banco de Dados!");
        }
    }
}
