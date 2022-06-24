package com.autobots.automanager.dto;

import java.util.List;

import com.autobots.automanager.entitades.Venda;

import lombok.Data;

@Data
public class VendaDto {
	private Venda venda;
	private Long veiculoId;
	private List<Long> mercadoriasId;
	private List<Long> servicosId;
}