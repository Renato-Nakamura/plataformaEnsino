package com.alternativo21.plataforma.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="tb_turma")
public class Turma {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(max=500)
	private String descrição;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;
	
	@OneToMany(mappedBy = "turma",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("turma")
	private List<Aluno> aluno;
	
	@OneToMany(mappedBy = "turma",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("turma")
	private List<Atividade> atividade;
	
	@ManyToMany(mappedBy = "turma")
	private Set<Professor> professor;
	
}
