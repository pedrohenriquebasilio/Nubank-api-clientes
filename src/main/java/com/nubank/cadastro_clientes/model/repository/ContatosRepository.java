package com.nubank.cadastro_clientes.model.repository;

import com.nubank.cadastro_clientes.model.contatos.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatosRepository extends JpaRepository <Contatos, Long> {
}
