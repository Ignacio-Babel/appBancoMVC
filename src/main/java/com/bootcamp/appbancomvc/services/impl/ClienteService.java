package com.bootcamp.appbancomvc.services.impl;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.repositories.IFakeDBCliente;
import com.bootcamp.appbancomvc.repositories.impl.FakeDBCliente;
import com.bootcamp.appbancomvc.services.IClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService implements IClienteService {
    IFakeDBCliente fakeDBClienteI;
    public  ClienteService(IFakeDBCliente fakeDBClienteI){this.fakeDBClienteI = fakeDBClienteI;}

    @Override
    public void init() {
        fakeDBClienteI.init();
    }

    @Override
    public void modify(int id, Cliente cliente) {
        fakeDBClienteI.modify(id,cliente);
    }

    @Override
    public List<Cliente> list() {
        return fakeDBClienteI.list();
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return fakeDBClienteI.getCliente(cliente);
    }
}
