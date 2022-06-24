package com.autobots.automanager.dto;


import javax.persistence.Entity;
import javax.persistence.Id;

import com.autobots.automanager.enumeracoes.TipoVeiculo;

import lombok.Data;

@Data
@Entity
public class VeiculoDto {
	@Id
	private Long id;
	private TipoVeiculo tipo;
	private String modelo;
	private String placa;
}