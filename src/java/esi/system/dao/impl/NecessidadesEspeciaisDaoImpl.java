package esi.system.dao.impl;

import esi.system.dao.NecessidadesEspeciaisDao;
import esi.system.model.NecessidadesEspeciais;

/**
 *
 * @author Bruno
 */
public class NecessidadesEspeciaisDaoImpl extends AbstractDaoImpl<NecessidadesEspeciais, String>
                implements NecessidadesEspeciaisDao {

    protected NecessidadesEspeciaisDaoImpl(){
        super(NecessidadesEspeciais.class);
    }
    
    @Override
    public void save(NecessidadesEspeciais n) {
        this.saveOrUpdate(n);
    }
    
}
