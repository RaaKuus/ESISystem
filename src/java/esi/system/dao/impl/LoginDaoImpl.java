package esi.system.dao.impl;

import esi.system.dao.LoginDao;
import esi.system.model.Login;
import java.util.List;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public class LoginDaoImpl extends AbstractDaoImpl<Login, Integer> implements LoginDao{

    
    protected LoginDaoImpl(){
        super(Login.class);
    }
    
    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM Telefone"));
    }

    @Override
    public void save(Login login) {
        this.saveOrUpdate(login);
    }

    @Override
    public List<Login> findLogins(String cpf) {
        return this.findByCriteria(Restrictions.like("cpf", cpf, MatchMode.START));
    }
    
}
