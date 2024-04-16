package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cliente;

import java.util.List;

public interface IClienteController {
    void init();
    void modify(int id, Cliente cliente);
    List<Cliente> list();
    Cliente getCliente(Cliente cliente);
}
