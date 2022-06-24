package com.autobots.automanager.modelos;

import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.VeiculoDto;
import com.autobots.automanager.entitades.Veiculo;

@Component
public class conversorVeiculo {
	public void converter(Veiculo veiculo, VeiculoDto VeiculoDto) {
		
		VeiculoDto.setId(veiculo.getId());
		VeiculoDto.setModelo(veiculo.getModelo());
		VeiculoDto.setPlaca(veiculo.getPlaca());
		VeiculoDto.setTipo(veiculo.getTipo());
	}
