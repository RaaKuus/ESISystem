/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.AnoLetivoDao;
import esi.system.model.AnoLetivo;
import esi.system.service.AlunoService;
import esi.system.service.AnoLetivoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("anoLetivoService")
@Transactional(readOnly = true)
public class AnoLetivoServiceImpl implements AnoLetivoService {

    @Autowired
    private AnoLetivoDao anoLetivoDao;
    
    @Override
    public List<AnoLetivo> findAnosLetivos(String ano) {
        return anoLetivoDao.findAnosLetivos(ano);
    }

    @Override
    public AnoLetivo findById(Integer id) {
        return anoLetivoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(AnoLetivo e) {
        anoLetivoDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        AnoLetivo anoLetivo = anoLetivoDao.findById(id);
        if(anoLetivo != null)
            anoLetivoDao.delete(anoLetivo);
    }

    @Override
    public int getTotal() {
        return anoLetivoDao.getTotal();
    }

    @Override
    public List<AnoLetivo> getViewList(int start, int limit) {
        return anoLetivoDao.getViewList(start, limit);
    }

}
