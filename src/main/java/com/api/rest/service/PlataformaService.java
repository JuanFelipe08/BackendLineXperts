package com.api.rest.service;

import java.util.List;

import com.api.rest.entity.Plataformas;

public interface PlataformaService {
	public List<Plataformas> findAll();

    public Plataformas findById(int Pla_Codigo);

    public void save(Plataformas plataforma);

    //public void deleteById(int Pla_Codigo);
}
