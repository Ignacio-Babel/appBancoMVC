package com.bootcamp.appbancomvc.repositories.impl;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.repositories.IFakeDBCliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
    public int add(Cliente cliente) {
        int id = clientes.size() + 1;
        cliente.setId(id);
        clientes.put(id, cliente);
        return id;
    }

    @Override
    public void modify(int id, Cliente cliente) {
        clientes.put(id,cliente);
    }

    @Override
    public List<Cliente> list() {
        return new ArrayList<>(clientes.values());
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        List<Cliente> listaClientes =list();
        return listaClientes.stream().filter(c -> c.equals(cliente)).findFirst().orElse(null);
    }

    @Override
    public Cliente delete(int idCliente) {
        return clientes.remove(idCliente);
    }
}
