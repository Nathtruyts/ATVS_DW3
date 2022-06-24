package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Venda;

@Component
public class vendaSelecionador {
	public Venda selecionar(List<Venda> vendas, Long id) {
		Venda selecionada = null;
		for(Venda venda : vendas) {
			if (venda.getId().equals(id)) {
				selecionada = venda;
			}
		}
		return selecionada;
	}
}