/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.Aluno;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface AlunoDao extends AbstractDao<Aluno, Integer> {
    void save(Aluno aluno);
    List<Aluno> findAlunos(String nome);
}
