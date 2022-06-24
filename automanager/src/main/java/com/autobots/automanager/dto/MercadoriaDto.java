package com.autobots.automanager.dto;

import com.autobots.automanager.entitades.Mercadoria;

import lombok.Data;

@Data
public class MercadoriaDto {
	Mercadoria mercadoria;
	String razaoSocial;
	Long fornecedorId;
	
	String dataFabricacaotxt;
	String dataValidadetxt;
}