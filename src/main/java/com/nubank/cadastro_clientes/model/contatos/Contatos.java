package com.nubank.cadastro_clientes.model.contatos;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nubank.cadastro_clientes.model.clientes.Clientes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ContatosRepository")
public class Contatos {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoContato;

    private String valor;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    private Clientes cliente;
}
