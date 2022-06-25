package com.autobots.automanager.atualizadores;

import com.autobots.automanager.entidades.Usuario;

public class UsuarioAtualizador {
	

	private void atualizarDados(Usuario usuario, Usuario atualizacao) {
		if (!verificador.verificar(atualizacao.getNome())) {
			usuario.setNome(atualizacao.getNome());
		}
		if (!verificador.verificar(atualizacao.getNomeSocial())) {
			usuario.setNomeSocial(atualizacao.getNomeSocial());
		}
		if (!(atualizacao.getPerfis() == null)) {
			usuario.setPerfis(atualizacao.getPerfis());
		}
		
		if (!(atualizacao.getVendas() == null)) {
			usuario.setVendas(atualizacao.getVendas());
		}
	}

	public void atualizar(Usuario usuario, Usuario atualizacao) {
		atualizarDados(usuario, atualizacao);
	}
}
