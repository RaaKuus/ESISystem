/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.DocumentosEntreguesDao;
import esi.system.model.DocumentosEntregues;
import esi.system.service.DocumentosEntreguesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("documentosEntreguesService")
@Transactional(readOnly = true)
public class DocumentosEntreguesServiceImpl implements DocumentosEntreguesService {

    @Autowired
    private DocumentosEntreguesDao documentosEntreguesDao;
    
    
    @Override
    public List<DocumentosEntregues> findDocumentosEntregues(String matricula) {
        return documentosEntreguesDao.findDocumentosEntregues(matricula);
    }

    @Override
    public DocumentosEntregues findById(Integer id) {
        return documentosEntreguesDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(DocumentosEntregues e) {
        documentosEntreguesDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        DocumentosEntregues d = documentosEntreguesDao.findById(id);
        if(d != null)
            documentosEntreguesDao.delete(d);
    }

    @Override
    public int getTotal() {
        return documentosEntreguesDao.getTotal();
    }

    @Override
    public List<DocumentosEntregues> getViewList(int start, int limit) {
        return documentosEntreguesDao.getViewList(start, limit);
    }
    
}
