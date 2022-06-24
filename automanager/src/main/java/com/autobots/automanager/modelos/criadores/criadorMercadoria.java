package com.autobots.automanager.modelos.criadores;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.MercadoriaDto;
import com.autobots.automanager.entitades.Mercadoria;

@Component
public class criadorMercadoria {
	@SuppressWarnings("deprecation")
	public Mercadoria criar(MercadoriaDto mercadoriaDTO) {
		
		Mercadoria mercadoria = mercadoriaDTO.getMercadoria();
		mercadoria.setCadastro(new Date());
		mercadoria.setFabricao(new Date(mercadoriaDTO.getDataFabricacaotxt()));
		mercadoria.setValidade(new Date(mercadoriaDTO.getDataValidadetxt()));
		
		return mercadoria;
	}
}