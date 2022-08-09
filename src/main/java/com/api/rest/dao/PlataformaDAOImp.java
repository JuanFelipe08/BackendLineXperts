package com.api.rest.dao;

import java.util.List;
import org.hibernate.query.Query;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.rest.entity.Plataformas;

@Repository
public class PlataformaDAOImp implements PlataformaDAO {
	@Autowired
    private EntityManager entityManager;
	
	@Override
    public List<Plataformas> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Plataformas> theQuery = currentSession.createQuery("from platform", Plataformas.class);

        List<Plataformas> plataformas = theQuery.getResultList();

        return plataformas;
    }
	
	@Override
    public Plataformas findById(int Pla_Codigo) {
        Session currentSession = entityManager.unwrap(Session.class);

        Plataformas plataforma = currentSession.get(Plataformas.class, Pla_Codigo);

        return plataforma;
    }
	
	@Override
    public void save(Plataformas plataforma) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(plataforma);
    }
}
