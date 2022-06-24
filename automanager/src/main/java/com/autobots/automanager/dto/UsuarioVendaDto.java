package com.autobots.automanager.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UsuarioVendaDto {
	@Id
	private Long id;
	private String nome;
	private String nomeSocial;
}