package com.alternativo21.plataforma.model;

import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "tb_atividade")
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String titulo;
	
	@Size(max=1000)
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("atividade")
	private Turma turma;
	
	@OneToMany(mappedBy = "atividade")
	private Set<Entrega> entrega;
}
