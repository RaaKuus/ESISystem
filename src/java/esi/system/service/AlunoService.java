/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service;

import esi.system.model.Aluno;
import java.util.List;

/**
 *
 * @author RaaKuus
 */
public interface AlunoService extends AbstractService<Aluno> {
    List<Aluno> findAlunos(String nome);
}
