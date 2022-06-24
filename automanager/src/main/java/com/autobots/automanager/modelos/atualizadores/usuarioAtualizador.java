package com.autobots.automanager.modelos.atualizadores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autobots.automanager.entitades.Usuario;
import com.autobots.automanager.modelos.VerificadorNull;

@Component
public class usuarioAtualizador {
	
	@Autowired
	VerificadorNull verificador;
	
	public void atualizar(Usuario usuario, Usuario atualizacao) {
		
		if (atualizacao != null) {
			if (!verificador.verificar(atualizacao.getNome())) {
		        usuario.setNome(atualizacao.getNome());
		      }

		      if (!verificador.verificar(atualizacao.getNomeSocial())) {
		        usuario.setNomeSocial(atualizacao.getNomeSocial());
		      }

		      if (!verificador.verificar(atualizacao.getEndereco())) {
		        usuario.setEndereco(atualizacao.getEndereco());
		      }
		}
	}
}