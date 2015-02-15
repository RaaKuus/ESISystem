/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao;

import esi.system.model.DocumentosEntregues;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface DocumentosEntreguesDao extends AbstractDao<DocumentosEntregues, Integer> {
    void save(DocumentosEntregues d);
    List<DocumentosEntregues> findDocumentosEntregues(String matricula);
}
