package esi.system.dao.impl;

import esi.system.dao.NecessidadesEspeciaisDao;
import esi.system.model.NecessidadesEspeciais;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class NecessidadesEspeciaisDaoImpl extends AbstractDaoImpl<NecessidadesEspeciais, String>
                implements NecessidadesEspeciaisDao {

    protected NecessidadesEspeciaisDaoImpl(){
        super(NecessidadesEspeciais.class);
    }
    
    @Override
    public void save(NecessidadesEspeciais n) {
        this.saveOrUpdate(n);
    }

    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find(("SELECT COUNT(*) FROM necessidades_especiais")));
    }
    
}
