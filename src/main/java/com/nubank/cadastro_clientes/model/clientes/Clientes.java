package com.nubank.cadastro_clientes.model.clientes;


import com.nubank.cadastro_clientes.model.contatos.Contatos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue
    private  Long id;

    private String email;

    private String cpf;

    private String rg;

    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contatos> contatos = new ArrayList<>();


}
