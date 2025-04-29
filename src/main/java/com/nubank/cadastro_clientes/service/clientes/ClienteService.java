package com.nubank.cadastro_clientes.service.clientes;


import com.nubank.cadastro_clientes.model.clientes.Clientes;
import com.nubank.cadastro_clientes.model.contatos.Contatos;
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

        Clientes savecliente = repository.save(cliente);
        return new ClienteResponseDTO(
                savecliente.getNome(),
                savecliente.getIdade(),
                savecliente.getEmail(),
                savecliente.getCpf(),
                savecliente.getRg(),
                savecliente.getTelefone(),
                List.of()
        );
    }


    public List<Clientes> getAllUsers() {
        return repository.findAll(); }

    public List<Contatos> findContatosById(Long id) {
        Clientes cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return cliente.getContatos();
    }


}
