package com.bootcamp.appbancomvc.controllers.impl;

import com.bootcamp.appbancomvc.controllers.IClienteController;
import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.services.IClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController implements IClienteController {
    IClienteService clienteService;
    public ClienteController(IClienteService clienteService){this.clienteService = clienteService;};
    @PostMapping()
    @Override
    public void init() {
        clienteService.init();
    }
    @PutMapping("/{id}")
    @Override
    public void modify(@PathVariable int id, Cliente cliente) {
        clienteService.modify(id,cliente);
    }
    @GetMapping()
    @Override
    public List<Cliente> list() {
        return clienteService.list();
    }
    @GetMapping("/exists")
    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteService.getCliente(cliente);
    }
}
