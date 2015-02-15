package esi.system.dao.impl;

import esi.system.dao.CondicoesSaudeDao;
import esi.system.model.CondicoesSaude;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class CondicoesSaudeDaoImpl extends AbstractDaoImpl<CondicoesSaude, Integer> implements CondicoesSaudeDao {
    
    protected CondicoesSaudeDaoImpl(){
        super(CondicoesSaude.class);
    }

    @Override
    public void save(CondicoesSaude cs) {
        this.saveOrUpdate(cs);
    }

    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("SELECT COUNT(*) FROM condicoes_saude"));
    }
}
