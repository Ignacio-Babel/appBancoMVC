package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cliente;
import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.services.IClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/clientes")
public class ClienteController {
    IClienteService clienteService;
    SucursalController sucursalController;
    public ClienteController(IClienteService clienteService,SucursalController sucursalController){
        this.clienteService = clienteService;
        this.sucursalController = sucursalController;
    }
    @PostMapping("/init")
    public void init() {
        clienteService.init();
    }
    @PostMapping
    public String add(@ModelAttribute("cliente") Cliente cliente) {
        this.clienteService.add(cliente);
        return "redirect:/clientes";
    }
    @PutMapping("/{id}")
    public void modify(@PathVariable int id, Cliente cliente) {
        clienteService.modify(id,cliente);
    }
    @GetMapping()
    public void list(Model model) {
        model.addAttribute("clientes", this.clienteService.list());
        sucursalController.list(model);
    }
    @GetMapping("/cliente/{id}")
    public String getCliente(Model model, @PathVariable("id") int idCliente) {
        Cliente exist = new Cliente();
        exist.setId(idCliente);
        model.addAttribute("cliente", this.clienteService.getCliente(exist));
        sucursalController.list(model);
        return "cliente-info";
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") int idCliente) {
        clienteService.delete(idCliente);
        return "redirect:/clientes";
    }
}
