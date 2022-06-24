package com.autobots.automanager.modelos.selecionadores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.UsuarioVendaDto;

@Component
public class usuarioVenDTOSelec {
	public UsuarioVendaDto selecionar(List<UsuarioVendaDto> usuariosVendaDTO, Long id) {
		UsuarioVendaDto selecionado = null;
		for (UsuarioVendaDto usuarioVendaDTO : usuariosVendaDTO) {
			if (usuarioVendaDTO.getId().equals(id)) {
				selecionado = usuarioVendaDTO;
			}
		}
		return selecionado;
	}
}