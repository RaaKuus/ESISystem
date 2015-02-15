package esi.system.dao.impl;

import esi.system.dao.AnoLetivoDao;
import esi.system.model.AnoLetivo;
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
public class AnoLetivoDaoImpl extends AbstractDaoImpl<AnoLetivo, Integer> implements AnoLetivoDao {
    
    protected AnoLetivoDaoImpl(){
        super(AnoLetivo.class);
    }
    
    @Override
    public void save(AnoLetivo anoLetivo){
        this.saveOrUpdate(anoLetivo);
    }
    
    @Override 
    public List<AnoLetivo> findAnosLetivos(String ano){
        return this.findByCriteria(Restrictions.like("ano", ano, MatchMode.START));
    }
    
    @Override
    public int getTotal(){
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM AnoLetivo"));
    }
}
