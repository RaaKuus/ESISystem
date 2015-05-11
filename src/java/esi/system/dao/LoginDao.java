package esi.system.dao;

import esi.system.model.Login;
import java.util.List;

/**
 *
 * @author Bruno
 */

public interface LoginDao extends AbstractDao<Login, Integer>{
    void save(Login login);
    List<Login> findLogins(String cpf);
}
