package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Usuario;

@Component
public class usuarioSelecionador {
	public Usuario selecionar(List<Usuario> usuarios, Long id) {
		Usuario selecionado = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getId().equals(id)) {
				selecionado = usuario;
			}
		}
		return selecionado;
	}
}