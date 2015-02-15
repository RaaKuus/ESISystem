/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.TurmaDao;
import esi.system.model.Turma;
import java.util.List;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class TurmaDaoImpl extends AbstractDaoImpl<Turma, Integer> implements TurmaDao {

    protected TurmaDaoImpl(){
        super(Turma.class);
    }
    
    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM Turma"));
    }

    @Override
    public void save(Turma turma) {
        this.saveOrUpdate(turma);
    }

    @Override
    public List<Turma> findTurmas(String turma) {
        return this.findByCriteria(Restrictions.like("serie", turma, MatchMode.START));
    }
    
}
