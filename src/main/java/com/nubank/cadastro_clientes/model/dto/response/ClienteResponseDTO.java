package com.nubank.cadastro_clientes.model.dto.response;

import com.nubank.cadastro_clientes.model.contatos.Contatos;

import java.util.List;

public record ClienteResponseDTO(String nome, Integer idade, String email, String cpf, String rg, String telefone, List<Contatos> lista) {
}
