package com.autobots.automanager.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entidades.telefone;

public interface telefoneRepositorio extends JpaRepository<Telefone, Long> {
}