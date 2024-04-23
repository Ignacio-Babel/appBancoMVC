package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.services.ISucursalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/sucursales")
public class SucursalController{

    private final ISucursalService sucursalService;

    public SucursalController(ISucursalService sucursalService){
        this.sucursalService = sucursalService;
    }

    @PostMapping("/init")
    public void initialize() {
        this.sucursalService.init();
    }

    @PostMapping
    public String add(@ModelAttribute("sucursal") Sucursal sucursal) {
        this.sucursalService.add(sucursal);
        return "redirect:/sucursales";
    }

    @PostMapping("/{idSucursal}")
    public String modify(@PathVariable int idSucursal, @ModelAttribute("sucursal") Sucursal newSucursal) {
        this.sucursalService.modify(idSucursal, newSucursal);
        return "redirect:/sucursales";
    }

    @GetMapping("/{idSucursal}")
    public String get(@PathVariable int idSucursal, Model model) {
        model.addAttribute("sucursal", this.sucursalService.get(idSucursal));
        return "sucursal-info";
    }

    @GetMapping
    public void list(Model model) {
        model.addAttribute("sucursales", this.sucursalService.list());
    }

    @PostMapping("/{idSucursal}/delete")
    public String delete(@PathVariable int idSucursal) {
        this.sucursalService.delete(idSucursal);
        return "redirect:/sucursales";
    }
}
