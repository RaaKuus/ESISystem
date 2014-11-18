package esi.system.dao.impl;

import esi.system.dao.AbstractDao;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author Bruno
 * @param <E>
 * @param <I>
 */
public abstract class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E,I>{

    private final Class<E> entityClass;
    private HibernateTemplate template;
    
    protected AbstractDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    protected HibernateTemplate getTemplate(){
        if(template != null)
            return template;
        else{
            this.template = new HibernateTemplate(sessionFactory);
            return this.template;
        }
    }
    
    @Override
    public List<E> getViewList(int start, int limit){
        DetachedCriteria criteria = DetachedCriteria.forClass(entityClass);
        return (List<E>) this.getTemplate().findByCriteria(criteria, start, limit);
    }
    
    @Override
    public E findById(I id){
        return (E) getCurrentSession().get(entityClass, id);
    }
    
    @Override
    public void saveOrUpdate(E e){
        getCurrentSession().saveOrUpdate(e);
    }
    
    @Override
    public void delete(E e){
        getCurrentSession().delete(e);
    }
    
    @Override
    public List<E> findByCriteria(Criterion criterion){
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
        
    }
}
