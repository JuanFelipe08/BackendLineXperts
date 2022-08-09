package com.api.rest.dao;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.api.rest.entity.Eventos;

public interface EventosDAO {
	public JSONArray findAll(int Pla_Codigo);
	
	public void save(Eventos evento);
}
