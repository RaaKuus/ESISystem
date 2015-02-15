/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.TelefoneDao;
import esi.system.model.Telefone;
import esi.system.service.TelefoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */
@Service("telefoneService")
@Transactional(readOnly = true)
public class TelefoneServiceImpl implements TelefoneService {

    @Autowired
    private TelefoneDao telefoneDao;
    
    @Override
    public List<Telefone> findTelefones(String matricula) {
        return telefoneDao.findTelefones(matricula);
    }

    @Override
    public Telefone findById(Integer id) {
        return telefoneDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Telefone e) {
        telefoneDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        Telefone telefone = telefoneDao.findById(id);
        if(telefone != null)
            telefoneDao.delete(telefone);
    }

    @Override
    public int getTotal() {
        return telefoneDao.getTotal();
    }

    @Override
    public List<Telefone> getViewList(int start, int limit) {
        return telefoneDao.getViewList(start, limit);
    }
    
}
