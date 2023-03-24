package com.AppRH.AppRH.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Candidato {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique = true)
	private String rg;
	
	@NotEmpty
	private String nomeCandidato;
	
	@NotEmpty
	private String email;
	
	@ManyToOne
	private Vaga vaga;

	
	

	public String getRg() {
		return rg;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public String getEmail() {
		return email;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

}
