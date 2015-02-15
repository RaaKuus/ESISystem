/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.AlunoAnoLetivo;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface AlunoAnoLetivoDao extends AbstractDao<AlunoAnoLetivo, Integer> {
    void save(AlunoAnoLetivo alunoAnoLetivo);
    List<AlunoAnoLetivo> findAlunoAnoLetivo(String matricula);
}
