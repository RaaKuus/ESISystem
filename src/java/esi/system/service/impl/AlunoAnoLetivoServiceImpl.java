/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.AlunoAnoLetivoDao;
import esi.system.model.AlunoAnoLetivo;
import esi.system.service.AlunoAnoLetivoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("alunoAnoLetivoService")
@Transactional(readOnly = true)
public class AlunoAnoLetivoServiceImpl implements AlunoAnoLetivoService{
    
    @Autowired
    private AlunoAnoLetivoDao alunoAnoLetivoDao;

    @Override
    public List<AlunoAnoLetivo> findAlunoAnoLetivo(String matricula) {
        return alunoAnoLetivoDao.findAlunoAnoLetivo(matricula);
    }

    @Override
    public AlunoAnoLetivo findById(Integer id) {
        return alunoAnoLetivoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(AlunoAnoLetivo e) {
        alunoAnoLetivoDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        AlunoAnoLetivo alunoAnoLetivo = alunoAnoLetivoDao.findById(id);
        if(alunoAnoLetivo != null)
            alunoAnoLetivoDao.delete(alunoAnoLetivo);
    }

    @Override
    public int getTotal() {
        return alunoAnoLetivoDao.getTotal();
    }

    @Override
    public List<AlunoAnoLetivo> getViewList(int start, int limit) {
        return alunoAnoLetivoDao.getViewList(start, limit);
    }
    
    
}
