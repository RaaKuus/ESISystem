/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.TurmaDao;
import esi.system.model.Turma;
import esi.system.service.TurmaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("turmaService")
@Transactional(readOnly = true)
public class TurmaServiceImpl implements TurmaService {
    
    @Autowired
    private TurmaDao turmaDao;
    
    @Override
    public List<Turma> findTurmas(String turma){
        return turmaDao.findTurmas(turma);
    }
    
    @Override
    public Turma findById(Integer id){
        return turmaDao.findById(id);
    }
    
    @Override
    @Transactional(readOnly = false)
    public void save(Turma t){
        turmaDao.save(t);
    }
    
    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id){
        Turma turma = turmaDao.findById(id);
        if(turma != null)
            turmaDao.delete(turma);
    }
    
    @Override
    public int getTotal(){
        return turmaDao.getTotal();
    }
    
    @Override
    public List<Turma> getViewList(int start, int limit){
        return turmaDao.getViewList(start, limit);
    }
}
