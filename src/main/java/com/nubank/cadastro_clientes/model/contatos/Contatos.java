package com.nubank.cadastro_clientes.model.contatos;


import com.nubank.cadastro_clientes.model.clientes.Clientes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contatos")
public class Contatos {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoContato;

    private String valor;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Clientes cliente;
}
