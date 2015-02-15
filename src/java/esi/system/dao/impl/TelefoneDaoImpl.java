/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.TelefoneDao;
import esi.system.model.Telefone;
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
public class TelefoneDaoImpl extends AbstractDaoImpl<Telefone, Integer> implements TelefoneDao {

    protected TelefoneDaoImpl(){
        super(Telefone.class);
    }
    
    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM Telefone"));
    }

    @Override
    public void save(Telefone t) {
        this.saveOrUpdate(t);
    }

    @Override
    public List<Telefone> findTelefones(String matricula) {
        return this.findByCriteria(Restrictions.like("alunosMatricula", matricula, MatchMode.START));
    }
    
}
