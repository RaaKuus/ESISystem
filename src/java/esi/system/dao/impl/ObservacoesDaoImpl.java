package esi.system.dao.impl;

import esi.system.dao.ObservacoesDao;
import esi.system.model.Observacoes;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class ObservacoesDaoImpl extends AbstractDaoImpl<Observacoes, Integer> implements ObservacoesDao {
    
    protected ObservacoesDaoImpl(){
        super(Observacoes.class);
    }

    @Override
    public void save(Observacoes o) {
        this.saveOrUpdate(o);
    }

    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find(("SELECT COUNT(*) FROM observacoes_matricula")));
    }
    
}
