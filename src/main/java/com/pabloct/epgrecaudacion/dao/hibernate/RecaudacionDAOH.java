package com.pabloct.epgrecaudacion.dao.hibernate;

import com.pabloct.epgrecaudacion.dao.RecaudacionDAO;
import com.pabloct.epgrecaudacion.model.Recaudacion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class RecaudacionDAOH extends BaseHibernateDAO implements RecaudacionDAO {

    @Override
    public List<Recaudacion> all() {
        Criteria criteria = this.getSession().createCriteria(Recaudacion.class);
        return criteria.list();
    }

    @Override
    public Recaudacion find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Recaudacion.class);
        criteria.add(Restrictions.eq("id", id));
        return (Recaudacion) criteria.uniqueResult();
    }

    @Override
    public void save(Recaudacion t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Recaudacion t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Recaudacion t) {
        this.getSession().delete(t);
    }

}
