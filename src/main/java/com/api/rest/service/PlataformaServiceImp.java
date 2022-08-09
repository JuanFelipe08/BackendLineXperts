package com.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.dao.PlataformaDAO;
import com.api.rest.entity.Plataformas;

@Service
public class PlataformaServiceImp implements PlataformaService {
	@Autowired
    private PlataformaDAO plataformaDAO;

    @Override
    public List<Plataformas> findAll() {
        List<Plataformas> listPlataforma = plataformaDAO.findAll();
        return listPlataforma;
    }

    @Override
    public Plataformas findById(int Pla_Codigo) {
        Plataformas plataforma = plataformaDAO.findById(Pla_Codigo);
        return plataforma;
    }

    @Override
    public void save(Plataformas plataforma) {
    	plataformaDAO.save(plataforma);

    }
}
