/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author RaaKuus
 * @param <E>
 */
public class ResultJS<E> {
    
    public Map<String, Object> mapOk(List<E> es){
        Map<String, Object> modelMap = new HashMap<>(3);
        modelMap.put("total", es.size());
        modelMap.put("data", es);
        modelMap.put("success", true);
        return modelMap;
    }
    
    public Map<String, Object> mapOk(List<E> es, int total){
        Map<String, Object> modelMap = new HashMap<>(3);
        modelMap.put("total", total);
        modelMap.put("data", es);
        modelMap.put("success", true);
        return modelMap;
    }
    
    public static Map<String, Object> mapError(String msg){
        Map<String, Object> modelMap = new HashMap<>(2);
        modelMap.put("message", msg);
        modelMap.put("success", false);
        return modelMap;
    }
    
    public static Map<String, Object> mapSuccessOnly(){
        Map<String,Object> modelMap = new HashMap<>(3);
        modelMap.put("success", true);
        return modelMap;
    }
    
    
}
