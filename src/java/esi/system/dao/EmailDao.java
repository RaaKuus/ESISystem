/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.Email;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface EmailDao extends AbstractDao<Email, Integer> {
    void save(Email email);
    List<Email> findEmails(String matricula);
}
