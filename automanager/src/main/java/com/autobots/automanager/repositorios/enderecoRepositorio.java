package com.autobots.automanager.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entidades.endereco;

public interface enderecoRepositorio extends JpaRepository<endereco, Long> {
}