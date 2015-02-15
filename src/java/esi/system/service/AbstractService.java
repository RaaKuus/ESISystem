/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.service;

import java.util.List;

/**
 *
 * @author RaaKuus
 * @param <E>
 */
public interface AbstractService<E> {
    E findById(Integer id);
    void save(E e);
    void delete(Integer id);
    int getTotal();
    List<E> getViewList(int start, int limit);
}
