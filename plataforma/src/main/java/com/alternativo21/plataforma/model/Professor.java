package com.alternativo21.plataforma.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_professor")
public class Professor extends Usuario{

	@ManyToMany
	@JoinTable(
		name = "turma_prof",
		joinColumns = @JoinColumn(name="professor_id"),
		inverseJoinColumns = @JoinColumn(name="turma_id"))
	private Set<Turma> turma;
	
	
	
}
