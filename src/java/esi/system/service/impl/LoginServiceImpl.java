package esi.system.service.impl;

import esi.system.dao.LoginDao;
import esi.system.model.Login;
import esi.system.service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bruno
 */

@Service("loginService")
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;
    
    @Override
    public List<Login> findLogins(String cpf) {
        return loginDao.findLogins(cpf);
    }

    @Override
    public Login findById(Integer id) {
        return loginDao.findById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Login e) {
        loginDao.save(e);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        Login login = loginDao.findById(id);
        if(login != null)
            loginDao.delete(login);
    }

    @Override
    public int getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Login> getViewList(int start, int limit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
