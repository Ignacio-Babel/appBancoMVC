package com.bootcamp.appbancomvc.repositories.impl;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.repositories.IFakeDBCliente;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class FakeDBCliente implements IFakeDBCliente {
    Map<Integer, Cliente> clientes;
    public  FakeDBCliente(){
        clientes = new HashMap<>();
    }

    @Override
    public void init() {
        clientes = new HashMap<>();
    }

    @Override
    public void modify(int id, Cliente cliente) {

    }

    @Override
    public List<Cliente> list() {
        return null;
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return null;
    }
}
