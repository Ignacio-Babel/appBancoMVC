package com.bootcamp.appbancomvc.services;

import com.bootcamp.appbancomvc.models.Cliente;

import java.util.List;

public interface IClienteService {
    void init();
    void modify(int id, Cliente cliente);
    List<Cliente> list();
    Cliente getCliente(Cliente cliente);
}
