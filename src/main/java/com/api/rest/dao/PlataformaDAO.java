package com.api.rest.dao;

import java.util.List;

import com.api.rest.entity.Plataformas;

public interface PlataformaDAO {
	public List<Plataformas> findAll();

    public Plataformas findById(int Pla_Codigo);

    public void save(Plataformas plataforma);
}
