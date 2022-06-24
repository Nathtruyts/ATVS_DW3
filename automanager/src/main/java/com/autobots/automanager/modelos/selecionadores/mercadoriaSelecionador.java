package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Mercadoria;

@Component
public class mercadoriaSelecionador {
	public Mercadoria selecionar(List<Mercadoria> mercadorias, Long id) {
		Mercadoria selecionado = null;
		for (Mercadoria mercadoria : mercadorias) {
			if (mercadoria.getId().equals(id)) {
				selecionado = mercadoria;
			}
		}
		return selecionado;
	}
}