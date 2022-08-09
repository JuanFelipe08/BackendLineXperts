package com.api.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tevents")
@Table(name="tiposeventos")
public class Tiposeventos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="TEve_Codigo")
    private int TEve_Codigo;
	
	@Column(name="TEve_Identificador")
    private String TEve_Identificador;
	
	@Column(name="TEve_Descripcion")
    private String TEve_Descripcion;
	
	@Column(name="TEve_Valor")
    private Float TEve_Valor;
	
	public Tiposeventos() {}

    public Tiposeventos(int TEve_Codigo, String TEve_Identificador, String TEve_Descripcion, Float TEve_Valor) {
        this.TEve_Codigo = TEve_Codigo;
        this.TEve_Identificador = TEve_Identificador;
        this.TEve_Descripcion = TEve_Descripcion;
        this.TEve_Valor = TEve_Valor;
    }
    
    public int getTEve_Codigo() {
        return TEve_Codigo;
    }
    
    public void setTEve_Codigo(int TEve_Codigo) {
        this.TEve_Codigo = TEve_Codigo;
    }
    
    public String getTEve_Identificador() {
        return TEve_Identificador;
    }
    
    public void setTEve_Identificador(String TEve_Identificador) {
        this.TEve_Identificador = TEve_Identificador;
    }
    
    public String getTEve_Descripcion() {
        return TEve_Descripcion;
    }
    
    public void setTEve_Descripcion(String TEve_Descripcion) {
        this.TEve_Descripcion = TEve_Descripcion;
    }
    
    public Float getTEve_Valor() {
        return TEve_Valor;
    }
    
    public void setTEve_Valor(Float TEve_Valor) {
        this.TEve_Valor = TEve_Valor;
    }
}
