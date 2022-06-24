package com.autobots.automanager.modelos.criadores;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.autobots.automanager.dto.EmpresaDto;
import com.autobots.automanager.entitades.Empresa;

@Component
public class criadorEmpresa {
	public Empresa criar(EmpresaDto empresaDTO) {
		
		empresaDTO.getEmpresa().setCadastro(new Date());
		empresaDTO.getEmpresa().setEndereco(empresaDTO.getEndereco());
		empresaDTO.getTelefones().forEach(telefone -> {
			empresaDTO.getEmpresa().getTelefones().add(telefone);
		});
		
		Empresa novaEmpresa = empresaDTO.getEmpresa();
		return novaEmpresa;
	}