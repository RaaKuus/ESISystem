/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.AnoLetivoDao;
import esi.system.model.AnoLetivo;
import java.util.List;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class AnoLetivoDaoImpl extends AbstractDaoImpl<AnoLetivo, String> implements AnoLetivoDao {
    
    
    public AnoLetivoDaoImpl() {
        super(AnoLetivo.class);
    }

    @Override
    public int getTotal() {
       return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM AnoLetivo"));
    }

    @Override
    public void save(AnoLetivo anoLetivo) {
        this.saveOrUpdate(anoLetivo);
    }

    @Override
    public List<AnoLetivo> list() {
        return this.getCurrentSession().createQuery("From AnoLetivo").list();
    }

}
