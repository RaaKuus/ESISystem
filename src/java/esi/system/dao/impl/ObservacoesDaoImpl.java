package esi.system.dao.impl;

import esi.system.dao.ObservacoesDao;
import esi.system.model.Observacoes;

/**
 *
 * @author Bruno
 */
public class ObservacoesDaoImpl extends AbstractDaoImpl<Observacoes, String> implements ObservacoesDao {
    
    protected ObservacoesDaoImpl(){
        super(Observacoes.class);
    }

    @Override
    public void save(Observacoes o) {
        this.saveOrUpdate(o);
    }
    
}
