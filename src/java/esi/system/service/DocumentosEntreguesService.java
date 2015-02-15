/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service;

import esi.system.model.DocumentosEntregues;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface DocumentosEntreguesService extends AbstractService<DocumentosEntregues> {
    List<DocumentosEntregues> findDocumentosEntregues(String matricula);
}
