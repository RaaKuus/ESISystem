/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.Turma;
import java.util.List;

/**
 *
 * @author Bruno
 */

public interface TurmaDao extends AbstractDao<Turma, Integer> {
    void save(Turma turma);
    List<Turma> findTurmas(String turma);
}
