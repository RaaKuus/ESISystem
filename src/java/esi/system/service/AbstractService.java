/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service;

/**
 *
 * @author RaaKuus
 * @param <E>
 */
public interface AbstractService<E> {
    E findById(String id);
    void save(E e);
    void delete(String id);
    
}
