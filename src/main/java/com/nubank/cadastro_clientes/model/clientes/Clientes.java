package com.nubank.cadastro_clientes.model.clientes;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nubank.cadastro_clientes.model.contatos.Contatos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Clientes")
public class Clientes {

    @Id
    @GeneratedValue
    private  Long id;

    private String nome;

    private int idade;

    private String email;

    private String cpf;

    private String rg;

    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Contatos> contatos = new ArrayList<Contatos>();


}
