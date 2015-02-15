/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.DocumentosEntreguesDao;
import esi.system.model.DocumentosEntregues;
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
public class DocumentosEntreguesDaoImpl 
                    extends AbstractDaoImpl<DocumentosEntregues, Integer> 
                    implements DocumentosEntreguesDao {

    protected DocumentosEntreguesDaoImpl(){
        super(DocumentosEntregues.class);
    }
    
    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM DocumentosEntregues"));
    }

    @Override
    public void save(DocumentosEntregues d) {
        this.saveOrUpdate(d);
    }

    @Override
    public List<DocumentosEntregues> findDocumentosEntregues(String matricula) {
        return this.findByCriteria(Restrictions.like("alunosMatricula", matricula, MatchMode.START));
    }
    
}
