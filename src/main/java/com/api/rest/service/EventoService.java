package com.api.rest.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.api.rest.entity.Eventos;

public interface EventoService {
	public JSONArray findAll(int Pla_Codigo);

	public void save(Eventos evento);
}
