package com.api.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "platform")
@Table(name="plataformas")
public class Plataformas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Pla_Codigo")
    private int Pla_Codigo;
	
	@Column(name="Pla_Nombre")
    private String Pla_Nombre;
	
	@Column(name="Pla_Referencia")
    private String Pla_Referencia;
	
	@Column(name="created_at")
    @CreationTimestamp
    private Date createdAt;
	
	@Column(name="updated_at")
    @UpdateTimestamp
    private Date updatedAt;
	
	public Plataformas() {}

    public Plataformas(int Pla_Codigo, String Pla_Nombre, String Pla_Referencia) {
        this.Pla_Codigo = Pla_Codigo;
        this.Pla_Nombre = Pla_Nombre;
        this.Pla_Referencia = Pla_Referencia;
    }
    
    public int getPla_Codigo() {
        return Pla_Codigo;
    }
    
    public void setPla_Codigo(int Pla_Codigo) {
        this.Pla_Codigo = Pla_Codigo;
    }
    
    public String getPla_Nombre() {
        return Pla_Nombre;
    }
    
    public void setPla_Nombre(String Pla_Nombre) {
        this.Pla_Nombre = Pla_Nombre;
    }
    
    public String getPla_Referencia() {
        return Pla_Referencia;
    }
    
    public void setPla_Referencia(String Pla_Referencia) {
        this.Pla_Referencia = Pla_Referencia;
    }
    
    @Override
    public String toString() {
        return "User [Pla_Codigo=" + Pla_Codigo + ", Pla_Nombre=" + Pla_Nombre + ", password=" + Pla_Referencia + "]";
    }
}
