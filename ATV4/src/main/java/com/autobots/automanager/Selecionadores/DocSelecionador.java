package com.autobots.automanager.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Documento;

@Component
public class DocSelecionador {
	public Documento selecionar(List<Documento> documentos, long id) {
		Documento selecionado = null;
		for (Documento documento : documentos) {
			if (documento.getId() == id) {
				selecionado = documento;
			}
		}
		return selecionado;
	}
}