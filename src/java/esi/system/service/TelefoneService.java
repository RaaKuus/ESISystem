package esi.system.service;

import esi.system.model.Telefone;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface TelefoneService extends AbstractService<Telefone> {
    List<Telefone> findTelefones(String matricula);
}
