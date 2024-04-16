package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Sucursal;

import java.util.List;


public interface ISucursalController {
    void initialize();
    int add( Sucursal sucursal);
    void modify( int idSucursal,  Sucursal newSucursal);
    List<Sucursal> list();
    Sucursal delete(int idSucursal);
}
