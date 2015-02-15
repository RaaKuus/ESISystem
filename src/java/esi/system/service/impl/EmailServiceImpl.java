/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service.impl;

import esi.system.dao.EmailDao;
import esi.system.model.Email;
import esi.system.service.EmailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("emailService")
@Transactional(readOnly = true)
public class EmailServiceImpl implements EmailService {
    
    @Autowired
    private EmailDao emailDao;

    @Override
    public List<Email> findEmails(String matricula) {
        return emailDao.findEmails(matricula);
    }

    @Override
    public Email findById(Integer id) {
        return emailDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Email e) {
        emailDao.save(e);
    }

    @Override
    public void delete(Integer id) {
        Email email = emailDao.findById(id);
        if(email != null)
            emailDao.delete(email);
    }

    @Override
    public int getTotal() {
        return emailDao.getTotal();
    }

    @Override
    public List<Email> getViewList(int start, int limit) {
        return emailDao.getViewList(start, limit);
    }
}
