/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.dao.impl;

import esi.system.dao.AlunoAnoLetivoDao;
import esi.system.model.AlunoAnoLetivo;
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
public class AlunoAnoLetivoDaoImpl extends AbstractDaoImpl<AlunoAnoLetivo, Integer> implements AlunoAnoLetivoDao {

    protected AlunoAnoLetivoDaoImpl(){
        super(AlunoAnoLetivo.class);
    }
    
    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM AlunoAnoLetivo"));
    }

    @Override
    public void save(AlunoAnoLetivo alunoAnoLetivo) {
        this.saveOrUpdate(alunoAnoLetivo);
    }

    @Override
    public List<AlunoAnoLetivo> findAlunoAnoLetivo(String matricula) {
        return this.findByCriteria(Restrictions.like("alunosMatricula", matricula, MatchMode.START));
    }
    
}
