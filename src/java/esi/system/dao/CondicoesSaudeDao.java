package esi.system.dao;

import esi.system.model.CondicoesSaude;

/**
 *
 * @author Bruno
 */
public interface CondicoesSaudeDao extends AbstractDao<CondicoesSaude, Integer>{
    void save(CondicoesSaude cs);
}
