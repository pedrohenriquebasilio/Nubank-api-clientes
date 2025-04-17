package com.nubank.cadastro_clientes.service.clientes;


import com.nubank.cadastro_clientes.model.clientes.Clientes;
import com.nubank.cadastro_clientes.model.dto.request.ClienteRequestDTO;
import com.nubank.cadastro_clientes.model.dto.response.ClienteResponseDTO;
import com.nubank.cadastro_clientes.model.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClientesRepository repository;

    public ClienteResponseDTO criarcliente(ClienteRequestDTO dto){
        Clientes cliente = new Clientes();
        cliente.setNome(dto.nome());
        cliente.setIdade(dto.idade());
        cliente.setRg(dto.rg());
        cliente.setCpf(dto.cpf());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());

       // cliente = ClientesRepository.(cliente);
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getIdade(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.getTelefone(),
                cliente.getRg(),
                List.of()
        );
    }

}
