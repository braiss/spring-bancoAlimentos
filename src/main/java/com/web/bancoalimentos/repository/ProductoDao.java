package com.web.bancoalimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.bancoalimentos.model.Producto;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer> {

}
