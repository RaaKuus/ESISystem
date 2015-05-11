package esi.system.service;

import esi.system.model.Login;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface LoginService extends AbstractService<Login> {
    List<Login> findLogins(String cpf);
}
