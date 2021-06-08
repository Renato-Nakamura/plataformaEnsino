package com.alternativo21.plataforma.model;

import java.time.OffsetDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="tb_entregas")
public class Entrega {
	@EmbeddedId
	private EntregaPK id;
	@Getter
	@Setter
	private String link;
	@Getter
	@Setter
	private String observação;
	
	private OffsetDateTime data;
	
}
