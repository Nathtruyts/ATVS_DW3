package com.autobots.automanager.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Telefone;

@Component
public class TelefoneSelecionador {
	public Telefone selecionar(List<Telefone> , long id) {
		 selecionado = null;
		for (Telefone telefone : telefones) {
			if (Telefone.getId() == id) {
				selecionado = telefone;
			}
		}
		return selecionado;
	}}