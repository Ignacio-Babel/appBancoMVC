package com.bootcamp.appbancomvc.controllers.impl;

import com.bootcamp.appbancomvc.controllers.ISucursalController;
import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.services.ISucursalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sucursales")
public class SucursalController implements ISucursalController {

    private final ISucursalService sucursalService;

    public SucursalController(ISucursalService sucursalService){
        this.sucursalService = sucursalService;
    }

    @PostMapping("/init")
    @Override
    public void initialize() {
        this.sucursalService.init();
    }

    @PostMapping
    @Override
    public int add(@RequestBody Sucursal sucursal) {
        return this.sucursalService.add(sucursal);
    }

    @PutMapping("/{idSucursal}")
    @Override
    public void modify(@PathVariable int idSucursal, @RequestBody Sucursal newSucursal) {
        this.sucursalService.modify(idSucursal, newSucursal);
    }

    @GetMapping
    @Override
    public List<Sucursal> list() {
        return this.sucursalService.list();
    }

    @DeleteMapping("/{idSucursal}")
    @Override
    public Sucursal delete(@PathVariable int idSucursal) {
        return this.sucursalService.delete(idSucursal);
    }
}
