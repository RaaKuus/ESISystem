package esi.system.dao;

import esi.system.model.NecessidadesEspeciais;

/**
 *
 * @author Bruno
 */
public interface NecessidadesEspeciaisDao extends AbstractDao<NecessidadesEspeciais, Integer> {
    void save(NecessidadesEspeciais n);
}