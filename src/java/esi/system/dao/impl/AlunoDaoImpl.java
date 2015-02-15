package esi.system.dao.impl;

import esi.system.dao.AlunoDao;
import esi.system.model.Aluno;
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
public class AlunoDaoImpl extends AbstractDaoImpl<Aluno, Integer> implements AlunoDao {

    protected AlunoDaoImpl(){
        super(Aluno.class);
    }
    
    @Override
    public void save(Aluno aluno) {
        this.saveOrUpdate(aluno);
    }

    @Override
    public List<Aluno> findAlunos(String nome) {
        
        return this.findByCriteria(Restrictions.like("nome", nome, MatchMode.START));
    }

    @Override
    public int getTotal() {
        return DataAccessUtils.intResult(this.getTemplate().find("Select COUNT(*) FROM Aluno"));
    }
    
}
