package com.bootcamp.appbancomvc.services;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.models.Sucursal;

import java.util.List;

public interface IClienteService {
    void init();
    int add(Cliente cliente);
    void modify(int id, Cliente cliente);
    List<Cliente> list();
    Cliente getCliente(Cliente cliente);
    Cliente delete(int idCliente);
}
