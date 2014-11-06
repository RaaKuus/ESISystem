package esi.system.dao;

import esi.system.model.CondicoesSaude;

/**
 *
 * @author Bruno
 */
public interface CondicoesSaudeDao extends AbstractDao<CondicoesSaude, String>{
    void save(CondicoesSaude cs);
}
