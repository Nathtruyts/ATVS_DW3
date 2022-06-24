package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Veiculo;

@Component
public class veiculoSelecionador {
	public Veiculo selecionar(List<Veiculo> veiculos, Long id) {
		Veiculo selecionado = null;
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getId().equals(id)) {
				selecionado = veiculo;
			}
		}
		return selecionado;
	}}