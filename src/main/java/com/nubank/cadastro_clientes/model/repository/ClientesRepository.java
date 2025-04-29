package com.nubank.cadastro_clientes.model.repository;

import com.nubank.cadastro_clientes.model.clientes.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
