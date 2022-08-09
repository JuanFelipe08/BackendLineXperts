package com.api.rest.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.dao.EventosDAO;
import com.api.rest.entity.Eventos;

@Service
public class EventoServiceImp implements EventoService {
	@Autowired
    private EventosDAO eventosDAO;

    @Override
    public JSONArray findAll() {
    	JSONArray listPlataforma = eventosDAO.findAll();
        return listPlataforma;
    }

    @Override
    public void save(Eventos evento) {
    	eventosDAO.save(evento);
    }
}
