package com.api.rest.dao;

import java.util.List;

import com.api.rest.entity.Tiposeventos;

public interface TipoEventoDAO {
	public List<Tiposeventos> findAll();
}
