package esi.system.service.impl;

import esi.system.dao.CondicoesSaudeDao;
import esi.system.model.CondicoesSaude;
import esi.system.service.CondicoesSaudeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("condicoesSaudeService")
@Transactional(readOnly = false)
public class CondicoesSaudeServiceImpl implements CondicoesSaudeService {

    @Autowired
    private CondicoesSaudeDao condicoesSaudeDao;
    
    @Override
    @Transactional(readOnly = true)
    public CondicoesSaude findById(Integer id) {
        return condicoesSaudeDao.findById(id);
    }
    
    @Override
    public void save(CondicoesSaude e) {
        condicoesSaudeDao.save(e);
    }

    @Override
    public void delete(Integer id) {
        CondicoesSaude condicoesSaude = condicoesSaudeDao.findById(id);
        if(condicoesSaude != null)
            condicoesSaudeDao.delete(condicoesSaude);
    }

    @Override
    public int getTotal() {
        return condicoesSaudeDao.getTotal();
    }

    @Override
    public List<CondicoesSaude> getViewList(int start, int limit) {
        return condicoesSaudeDao.getViewList(start, limit);
    }
    
}
