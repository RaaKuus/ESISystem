/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.Observacoes;

/**
 *
 * @author Bruno
 */

public interface ObservacoesDao extends AbstractDao<Observacoes, String> {
    void save(Observacoes o);
}
