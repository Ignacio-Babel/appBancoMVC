package com.bootcamp.appbancomvc.repositories;

import com.bootcamp.appbancomvc.models.Cliente;

import java.util.HashMap;
import java.util.List;

public interface IFakeDBCliente {
    void init();
    void modify(int id, Cliente cliente);
    List<Cliente> list();
    Cliente getCliente(Cliente cliente);
    //TODO
}
