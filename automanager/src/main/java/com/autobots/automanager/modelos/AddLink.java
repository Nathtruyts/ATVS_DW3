package com.autobots.automanager.modelos;

import java.util.List;

import com.autobots.automanager.entitades.Usuario;


public interface AddLink<T> {
	public void adicionarLink(List<T> lista);
	public void adicionarLink(T objeto);
	void AddLink(Usuario objeto);
}