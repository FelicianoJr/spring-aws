package br.com.specification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name = "tb_contabil")
@Getter
@ToString
public class Contabil {

	@Id
	private Long id;
	
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "descricao")
	private String descricao;
}
