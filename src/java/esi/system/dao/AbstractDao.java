package esi.system.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.Criterion;

/**
 *
 * @author Bruno
 * @param <E>
 * @param <I>
 */
public interface AbstractDao<E, I extends Serializable> {
    E findById(I id);
    void saveOrUpdate(E e);
    void delete(E e);
    List<E> findByCriteria(Criterion c);
    List<E> getViewList(int start, int limit);
    int getTotal();
}
