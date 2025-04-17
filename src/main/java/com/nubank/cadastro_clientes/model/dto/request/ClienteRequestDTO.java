package com.nubank.cadastro_clientes.model.dto.request;


public record ClienteRequestDTO(String nome, Integer idade, String email, String cpf, String rg, String telefone )  {
}
