package org.aaf.escolar;

import java.io.Serializable;
import java.util.Date;


public class LocationRotaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;
	
	private String nomeMapa;

	private double latitude;

	private double longitude;
	
	private String androidID;
	
	private int periodo;
	
	private Date hora;
	
	public LocationRotaDTO() {
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		final LocationRotaDTO other = (LocationRotaDTO) obj;
		if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.id))) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getAndroidID() {
		return androidID;
	}

	public void setAndroidID(String androidID) {
		this.androidID = androidID;
	}

	public String getNomeMapa() {
		return nomeMapa;
	}

	public void setNomeMapa(String nomeMapa) {
		this.nomeMapa = nomeMapa;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

}