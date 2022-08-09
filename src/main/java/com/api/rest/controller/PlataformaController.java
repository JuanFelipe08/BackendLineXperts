package com.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Plataformas;
import com.api.rest.service.PlataformaService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/api/plat")
public class PlataformaController {
	@Autowired
    private PlataformaService plataformaService;
	
	@GetMapping()
    public List<Plataformas> findAll(){
        return plataformaService.findAll();
    }
	
	@GetMapping("/{Pla_Codigo}")
    public Plataformas getPlataformas(@PathVariable int Pla_Codigo){
		Plataformas plataforma = plataformaService.findById(Pla_Codigo);

        if(plataforma == null) {
            throw new RuntimeException("La Plataforma no existe -"+Pla_Codigo);
        }
        return plataforma;
    }
	
	@PostMapping()
    public ResponseEntity<Plataformas> addPlataformas(@RequestBody Plataformas plataforma) {
		plataforma.setPla_Codigo(0);
		
		plataformaService.save(plataforma);
		
        try {
        	plataformaService.save(plataforma);
        	return new ResponseEntity<>(plataforma, HttpStatus.CREATED);
        } catch (Exception e) {
        	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@PutMapping()
    public ResponseEntity<Plataformas> updatPlataformas(@RequestBody Plataformas plataforma) {
		Plataformas plataformaData = plataformaService.findById(plataforma.getPla_Codigo());
	    if (plataformaData.getPla_Codigo() > 0) {
	    	Plataformas _plataformaData = plataformaData;
	    	_plataformaData.setPla_Nombre(plataforma.getPla_Nombre());
	    	_plataformaData.setPla_Referencia(plataforma.getPla_Referencia());
	    	plataformaService.save(_plataformaData);
	      return new ResponseEntity<>(_plataformaData, HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
    }
}
