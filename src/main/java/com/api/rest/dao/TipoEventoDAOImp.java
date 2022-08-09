package com.api.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.rest.entity.Tiposeventos;

@Repository
public class TipoEventoDAOImp implements TipoEventoDAO {
	@Autowired
    private EntityManager entityManager;
	
	@Override
    public List<Tiposeventos> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        //Query<Tiposeventos> theQuery = currentSession.createQuery("select TEve_Codigo, TEve_Identificador, TEve_Descripcion from tevents", Tiposeventos.class);
        List<Tiposeventos> teventos = currentSession.createNativeQuery("SELECT TEve_Codigo, TEve_Identificador, TEve_Descripcion, TEve_Valor FROM tiposeventos", Tiposeventos.class ).list();


        //List<Tiposeventos> teventos = theQuery.getResultList();

        return teventos;
    }
}
