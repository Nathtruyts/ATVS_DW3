package com.autobots.automanager.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entidades.documento;

public interface docuementoRepositorio extends JpaRepository<documento, Long> {
}