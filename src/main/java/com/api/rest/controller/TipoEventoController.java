package com.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Tiposeventos;
import com.api.rest.service.TipoEventoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/api/teven")
public class TipoEventoController {
	@Autowired
    private TipoEventoService tipoEventoService;
	
	@GetMapping()
    public List<Tiposeventos> findAll(){
        return tipoEventoService.findAll();
    }
}
