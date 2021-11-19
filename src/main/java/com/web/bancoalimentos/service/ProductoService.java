package com.web.bancoalimentos.service;


import java.util.Optional;

import com.web.bancoalimentos.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	
}
