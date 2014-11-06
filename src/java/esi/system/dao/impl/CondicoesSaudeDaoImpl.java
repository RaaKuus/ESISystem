package esi.system.dao.impl;

import esi.system.dao.CondicoesSaudeDao;
import esi.system.model.CondicoesSaude;

/**
 *
 * @author Bruno
 */
public class CondicoesSaudeDaoImpl extends AbstractDaoImpl<CondicoesSaude, String> implements CondicoesSaudeDao {
    
    protected CondicoesSaudeDaoImpl(){
        super(CondicoesSaude.class);
    }

    @Override
    public void save(CondicoesSaude cs) {
        this.saveOrUpdate(cs);
    }
}
