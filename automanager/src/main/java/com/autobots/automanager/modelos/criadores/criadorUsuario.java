package com.autobots.automanager.modelos.criadores;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.UsuarioDto;
import com.autobots.automanager.entitades.Usuario;
import com.autobots.automanager.enumeracoes.PerfilUsuario;

@Component
public class criadorUsuario {
	public Usuario criar(UsuarioDto usuarioDTO, PerfilUsuario perfilUsuario) {
		
		Usuario usuario = usuarioDTO.getUsuario();
		usuario.getPerfis().add(perfilUsuario);
		usuario.setEndereco(usuarioDTO.getEndereco());
		usuario.getTelefones().addAll(usuarioDTO.getTelefones());
		
		usuarioDTO.getDocumentos().forEach(documento -> {
			Date dataEmissao = new Date();
		    documento.setDataEmissao(dataEmissao);
		});
		
		usuario.getDocumentos().addAll(usuarioDTO.getDocumentos());
		usuario.getEmails().addAll(usuarioDTO.getEmails());
		
		usuarioDTO.getCredencial().setCriacao(new Date());
		usuarioDTO.getCredencial().setUltimoAcesso(new Date());
		usuarioDTO.getCredencial().setInativo(false);
		
		usuario.getCredenciais().add(usuarioDTO.getCredencial());
		
		return usuario;
	}
	
	public void registrarMercadorias(UsuarioDto fornecedorDto) {
		
		if(fornecedorDto.getMercadorias() != null) {
			fornecedorDto.getMercadorias().forEach(mercadoria -> {
				mercadoria.setCadastro(new Date());
				mercadoria.setFabricao(new Date());
			    mercadoria.setValidade(new Date());
			    
			    fornecedorDto.getUsuario().getMercadorias().add(mercadoria);
			});
		}
	}}