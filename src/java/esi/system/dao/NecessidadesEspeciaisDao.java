package esi.system.dao;

import esi.system.model.NecessidadesEspeciais;

/**
 *
 * @author Bruno
 */
public interface NecessidadesEspeciaisDao extends AbstractDao<NecessidadesEspeciais, String> {
    void save(NecessidadesEspeciais n);
}