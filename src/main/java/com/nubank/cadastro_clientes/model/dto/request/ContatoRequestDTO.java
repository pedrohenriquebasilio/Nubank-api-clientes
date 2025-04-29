package com.nubank.cadastro_clientes.model.dto.request;

import com.nubank.cadastro_clientes.model.clientes.Clientes;

public record ContatoRequestDTO (Long id, String tipoContato, String valor, Long clienteid){
}
