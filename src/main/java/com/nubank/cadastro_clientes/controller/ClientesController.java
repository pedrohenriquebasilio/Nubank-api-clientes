package com.nubank.cadastro_clientes.controller;

import com.nubank.cadastro_clientes.service.clientes.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {

    @Autowired
    private ClienteService service;


}
