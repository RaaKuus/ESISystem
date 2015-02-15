/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.EmailDao;
import esi.system.model.Email;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */

@Repository
public class EmailDaoImpl extends AbstractDaoImpl<Email, Integer> implements EmailDao {
    
    protected EmailDaoImpl(){
        super(Email.class);
    }
    
    @Override
    public void save(Email email){
        this.saveOrUpdate(email);
    }
    
    @Override
    public List<Email> findEmails(String matricula){
        return this.findByCriteria(Restrictions.like("alunosMatricula", this));
    }
    
    @Override
    public int getTotal(){
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM Email"));
    }
}
