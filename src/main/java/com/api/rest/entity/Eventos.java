package com.api.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name = "events")
@Table(name = "eventos")
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Eve_Codigo")
	private int Eve_Codigo;

	@Column(name = "Pla_Codigo")
	@JoinColumn(name = "platform", referencedColumnName = "Pla_Codigo")
	private int Pla_Codigo;
	
	@Column(name = "TEve_Codigo")
	@JoinColumn(name = "tevents", referencedColumnName = "TEve_Codigo")
	private int TEve_Codigo;

	@Column(name = "Eve_Cantidad")
	private int Eve_Cantidad;

	@Column(name = "created_at")
	@CreationTimestamp
	private Date created_at;

	public Eventos() {
	}

	public Eventos(int Eve_Codigo, int Pla_Codigo, int TEve_Codigo, int Eve_Cantidad) {
		this.Eve_Codigo = Eve_Codigo;
		this.Pla_Codigo = Pla_Codigo;
		this.TEve_Codigo = TEve_Codigo;
		this.Eve_Cantidad = Eve_Cantidad;
	}

	public int getEve_Codigo() {
		return Eve_Codigo;
	}

	public int getPla_Codigo() {
		return Pla_Codigo;
	}

	public int getTEve_Codigo() {
		return TEve_Codigo;
	}

	public int getEve_Cantidad() {
		return Eve_Cantidad;
	}

	public void setEve_Codigo(int Eve_Codigo) {
		this.Eve_Codigo = Eve_Codigo;
	}

	public void setPla_Codigo(int Pla_Codigo) {
		this.Pla_Codigo = Pla_Codigo;
	}

	public void setTEve_Codigo(int TEve_Codigo) {
		this.TEve_Codigo = TEve_Codigo;
	}

	public void setEve_Cantidad(int Eve_Cantidad) {
		this.Eve_Cantidad = Eve_Cantidad;
	}
}
