package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Empresa;

@Component
public class empresaSelecionador {
	public Empresa selecionar(List<Empresa> empresas, Long id) {
		Empresa selecionado = null;
		for (Empresa empresa : empresas) {
			if (empresa.getId().equals(id)) {
				selecionado = empresa;
			}
		}
		return selecionado;
	}
	
	public Empresa selecionarRazaoSocial(List<Empresa> empresas, String razaoSocial) {
		Empresa selecionada = null;
		for (Empresa empresa : empresas) {
			if (empresa.getRazaoSocial().equals(razaoSocial)) {
				selecionada = empresa;
			}
		}
		return selecionada;
	}
}
