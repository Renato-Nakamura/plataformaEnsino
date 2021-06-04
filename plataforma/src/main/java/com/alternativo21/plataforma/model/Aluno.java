package com.alternativo21.plataforma.model;

import java.util.Set;

import javax.persistence.Entity;


import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno extends Usuario{
	
	@ManyToOne
	@JsonIgnoreProperties("aluno")
	private Turma turma;
	
	//@ManyToMany
	//private Atividade atividade;
	
	@OneToMany(mappedBy = "aluno")
	private Set<Entrega> entrega;
}
