package com.autobots.automanager.dto;

import java.util.List;

import com.autobots.automanager.entitades.Empresa;
import com.autobots.automanager.entitades.Endereco;
import com.autobots.automanager.entitades.Telefone;

import lombok.Data;

@Data
public class EmpresaDto {
	Empresa empresa;
	Endereco endereco;
	List<Telefone> telefones;
}