package com.api.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.rest.entity.Eventos;
import com.api.rest.entity.Tiposeventos;

@Repository
public class EventosDAOImp implements EventosDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public JSONArray findAll(int Pla_Codigo) {
		Session currentSession = entityManager.unwrap(Session.class);

		// Query<Eventos> theQuery = currentSession.createQuery("from events",
		// Eventos.class);
		List<Object[]> eventosData = currentSession
				.createNativeQuery(
						"SELECT TE.TEve_Descripcion, CONVERT(E.created_at, DATE), E.Eve_Cantidad, (E.Eve_Cantidad * TE.TEve_Valor) FROM eventos E\r\n"
						+ "INNER JOIN tiposeventos TE ON TE.TEve_Codigo = E.TEve_Codigo WHERE E.Pla_Codigo = :pla ")
				.setParameter( "pla", Pla_Codigo).list();

		JSONArray myAObject = new JSONArray();		
		for (Object[] evento : eventosData) {
			JSONObject myObject = new JSONObject();
			myObject.put("Evento", evento[0]);
			myObject.put("Fecha", evento[1]);
			myObject.put("Cantidad", evento[2]);
			myObject.put("Valor", evento[3]);
			myAObject.put(myObject);
		}
		return myAObject;
	}

	@Override
	public void save(Eventos evento) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(evento);
	}
}
