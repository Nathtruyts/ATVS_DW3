package com.autobots.automanager.modelos.criadores;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.VeiculoDto;
import com.autobots.automanager.dto.VendaDto;
import com.autobots.automanager.entitades.Mercadoria;
import com.autobots.automanager.entitades.Servico;
import com.autobots.automanager.entitades.Veiculo;
import com.autobots.automanager.entitades.Venda;
import com.autobots.automanager.modelos.conversorVeiculo;
import com.autobots.automanager.modelos.selecionadores.mercadoriaSelecionador;
import com.autobots.automanager.modelos.selecionadores.servicoSelecionador;
import com.autobots.automanager.modelos.selecionadores.veiculoSelecionador;
import com.autobots.automanager.repositorios.RepositorioMercadoria;
import com.autobots.automanager.repositorios.RepositorioServico;
import com.autobots.automanager.repositorios.RepositorioVeiculoDto;
import com.autobots.automanager.repositorios.RepositorioVeiculo;

@Component
public class criadorVenda {
	
	@Autowired
	RepositorioServico servicoRepositorio;
	@Autowired
	servicoSelecionador servicoSelecionador;
	@Autowired
	RepositorioMercadoria mercadoriaRepositorio;
	@Autowired
	mercadoriaSelecionador mercadoriaSelecionador;
	@Autowired
	RepositorioVeiculo veiculoRepositorio;
	@Autowired
	veiculoSelecionador veiculoSelecionador;
	@Autowired
	conversorVeiculo conversorVeiculo;
	@Autowired
	RepositorioVeiculoDto veiculoDTORepositorio;
	
	public Venda criar(VendaDto vendaDto) {
		
		Venda Vendanova = vendaDto.getVenda();
		
		if (vendaDto.getMercadoriasId() != null) {
			List<Mercadoria> mercadorias = mercadoriaRepositorio.findAll();
			for (Long id : vendaDto.getMercadoriasId()) {
				Mercadoria mercadoria = mercadoriaSelecionador.selecionar(mercadorias, id);
				Vendanova.getMercadorias().add(mercadoria);
			}
		}
		
		if (vendaDto.getServicosId() != null) {
			List<Servico> servicos = servicoRepositorio.findAll();
			for (Long id : vendaDto.getServicosId()) {
				Servico servico = servicoSelecionador.selecionar(servicos, id);
				Vendanova.getServicos().add(servico);
			}
		}
		
		if (vendaDto.getVeiculoId() != null) {
			VeiculoDto veiculoDTO = veiculoDTORepositorio.getById(vendaDto.getVeiculoId());
			Vendanova.setVeiculo(VeiculoDto);
		}
		
		Vendanova.setCadastro(new Date());
		
		return Vendanova;
	}}