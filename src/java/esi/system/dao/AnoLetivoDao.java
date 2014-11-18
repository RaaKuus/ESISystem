package esi.system.dao;

import esi.system.model.AnoLetivo;
import java.util.List;

/**
 *
 * @author Bruno
 */
public interface AnoLetivoDao extends AbstractDao<AnoLetivo, String> {
    void save(AnoLetivo anoLetivo);
    List<AnoLetivo> list();
}
