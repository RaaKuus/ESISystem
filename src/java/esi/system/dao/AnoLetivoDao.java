/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.AnoLetivo;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface AnoLetivoDao extends AbstractDao<AnoLetivo, Integer>{
    void save(AnoLetivo anoLetivo);
    List<AnoLetivo> findAnosLetivos(String ano);
}
