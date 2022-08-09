package com.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.dao.TipoEventoDAO;
import com.api.rest.entity.Tiposeventos;

@Service
public class TipoEventoServiceImp implements TipoEventoService {
	@Autowired
    private TipoEventoDAO tipoEventoDAO;

    @Override
    public List<Tiposeventos> findAll() {
        List<Tiposeventos> listTEvento = tipoEventoDAO.findAll();
        return listTEvento;
    }
}
