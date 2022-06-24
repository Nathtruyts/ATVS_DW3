package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Servico;

@Component
public class servicoSelecionador {
	public Servico selecionar(List<Servico> servicos, Long id) {
		Servico selecionado = null;
		for (Servico servico : servicos) {
			if (servico.getId().equals(id)) {
				selecionado = servico;
			}
		}
		return selecionado;
	}
}