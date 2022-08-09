package com.api.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Eventos;
import com.api.rest.service.EventoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/api/even")
public class EventosController {
	@Autowired
    private EventoService eventoService;
	
	@GetMapping("/{Pla_Codigo}")
    public ResponseEntity<?> findAll(@PathVariable int Pla_Codigo){
		return new ResponseEntity<>(eventoService.findAll(Pla_Codigo).toString(), HttpStatus.CREATED);
    }
	
	@PostMapping()
    public ResponseEntity<Eventos> addEvento(@RequestBody Eventos evento) {
		evento.setEve_Codigo(0);
		
		eventoService.save(evento);
		
        try {
        	eventoService.save(evento);
        	return new ResponseEntity<>(evento, HttpStatus.CREATED);
        } catch (Exception e) {
        	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
