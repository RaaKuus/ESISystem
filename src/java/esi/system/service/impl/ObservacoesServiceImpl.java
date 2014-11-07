package esi.system.service.impl;

import esi.system.dao.ObservacoesDao;
import esi.system.model.Observacoes;
import esi.system.service.ObservacoesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */
@Service("observacoesService")
@Transactional(readOnly = false)
public class ObservacoesServiceImpl implements ObservacoesService {

    @Autowired
    private ObservacoesDao observacoesDao;
    
    @Override
    public Observacoes findById(String id) {
        return observacoesDao.findById(id);
    }

    @Override
    public void save(Observacoes e) {
        observacoesDao.save(e);
    }

    @Override
    public void delete(String id) {
        Observacoes observacoes = observacoesDao.findById(id);
        if(observacoes != null)
            observacoesDao.delete(observacoes);
    }

    @Override
    public int getTotal() {
        return observacoesDao.getTotal();
    }

    @Override
    public List<Observacoes> getListView(int start, int limit) {
        return observacoesDao.getViewList(start, limit);
    }
    
}
