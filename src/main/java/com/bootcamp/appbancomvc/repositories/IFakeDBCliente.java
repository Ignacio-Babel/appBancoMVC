package com.bootcamp.appbancomvc.repositories;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.models.Sucursal;

import java.util.HashMap;
import java.util.List;

public interface IFakeDBCliente {
    void init();
    int add(Cliente cliente);
    void modify(int id, Cliente cliente);
    List<Cliente> list();
    Cliente getCliente(Cliente cliente);
    Cliente delete(int idCliente);
    //TODO
}
