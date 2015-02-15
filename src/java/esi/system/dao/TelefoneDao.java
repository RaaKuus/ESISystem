/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.Telefone;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface TelefoneDao extends AbstractDao<Telefone, Integer> {
    void save(Telefone t);
    List<Telefone> findTelefones(String matricula);
}
