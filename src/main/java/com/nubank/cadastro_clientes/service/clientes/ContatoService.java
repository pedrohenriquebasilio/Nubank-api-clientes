package com.nubank.cadastro_clientes.service.clientes;


import com.nubank.cadastro_clientes.model.clientes.Clientes;
import com.nubank.cadastro_clientes.model.contatos.Contatos;
import com.nubank.cadastro_clientes.model.dto.request.ClienteRequestDTO;
import com.nubank.cadastro_clientes.model.dto.request.ContatoRequestDTO;
import com.nubank.cadastro_clientes.model.dto.response.ClienteResponseDTO;
import com.nubank.cadastro_clientes.model.dto.response.ContatoResponseDTO;
import com.nubank.cadastro_clientes.model.repository.ClientesRepository;
import com.nubank.cadastro_clientes.model.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatosRepository repository;

    @Autowired
    private ClientesRepository clientesRepository;

    public ContatoResponseDTO criarContato(Long id, ContatoRequestDTO dto){
        Clientes cliente = clientesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Contatos contatos = new Contatos();
        contatos.setTipoContato(dto.tipoContato());
        contatos.setValor(dto.valor());
        contatos.setCliente(cliente);

        Contatos saveContatos = repository.save(contatos);
        return  new ContatoResponseDTO(
                saveContatos.getTipoContato(),
                saveContatos.getValor(),
                saveContatos.getCliente().getId()
        );
    }


}
