package esi.system.dao.impl;

import esi.system.dao.AlunoDao;
import esi.system.model.Aluno;
import java.util.List;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bruno
 */
public class AlunoDaoImpl extends AbstractDaoImpl<Aluno, String> implements AlunoDao {

    protected AlunoDaoImpl(){
        super(Aluno.class);
    }
    
    @Override
    public void save(Aluno aluno) {
        this.saveOrUpdate(aluno);
    }

    @Override
    public List<Aluno> find(String nome) {
        return this.findByCriteria(Restrictions.like("nome", nome, MatchMode.START));
    }
    
}
