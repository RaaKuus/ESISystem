/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.AlunoDao;
import esi.system.model.Aluno;
import esi.system.service.AlunoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RaaKuus
 */

@Service("alunoService")
@Transactional(readOnly = true)
public class AlunoServiceImpl implements AlunoService{
    
    @Autowired
    private AlunoDao alunoDao;

    @Override
    public List<Aluno> findAlunos(String nome) {
        return alunoDao.findAlunos(nome);
    }

    @Override
    public Aluno findById(Integer id) {
        return alunoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Aluno e) {
        alunoDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        Aluno aluno = alunoDao.findById(id);
        if(aluno != null)
            alunoDao.delete(aluno);
    }

    @Override
    public int getTotal() {
        return alunoDao.getTotal();
    }

    @Override
    public List<Aluno> getViewList(int start, int limit) {
        return alunoDao.getViewList(start, limit);
    }

}
