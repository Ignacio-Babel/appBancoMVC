package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.services.IClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/clientes")
public class ClienteController {
    IClienteService clienteService;
    public ClienteController(IClienteService clienteService){this.clienteService = clienteService;};
    @PostMapping()
    public void init() {
        clienteService.init();
    }
    @PutMapping("/{id}")
    public void modify(@PathVariable int id, Cliente cliente) {
        clienteService.modify(id,cliente);
    }
    @GetMapping()
    public List<Cliente> list() {
        return clienteService.list();
    }
    @GetMapping("/exists")
    public Cliente getCliente(Cliente cliente) {
        return clienteService.getCliente(cliente);
    }
}
