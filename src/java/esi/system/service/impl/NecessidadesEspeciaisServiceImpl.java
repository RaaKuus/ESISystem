package esi.system.service.impl;

import esi.system.dao.NecessidadesEspeciaisDao;
import esi.system.model.NecessidadesEspeciais;
import esi.system.service.NecessidadesEspeciaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */
@Service("necessidadesEspeciaisService")
@Transactional(readOnly = false)
public class NecessidadesEspeciaisServiceImpl implements NecessidadesEspeciaisService {

    @Autowired
    private NecessidadesEspeciaisDao necessidadesEspeciaisDao;
    
    @Override
    @Transactional(readOnly = true)
    public NecessidadesEspeciais findById(Integer id) {
        return necessidadesEspeciaisDao.findById(id);
    }

    @Override
    public void save(NecessidadesEspeciais e) {
        necessidadesEspeciaisDao.save(e);
    }

    @Override
    public void delete(Integer id) {
        NecessidadesEspeciais necessidadesEspeciais = necessidadesEspeciaisDao.findById(id);
        if(necessidadesEspeciais != null)
            necessidadesEspeciaisDao.delete(necessidadesEspeciais);
    }

    @Override
    public int getTotal() {
        return necessidadesEspeciaisDao.getTotal();
    }

    @Override
    public List<NecessidadesEspeciais> getViewList(int start, int limit) {
        return necessidadesEspeciaisDao.getViewList(start, limit);
    }
}
