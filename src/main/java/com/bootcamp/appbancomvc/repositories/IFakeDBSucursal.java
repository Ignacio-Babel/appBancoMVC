package com.bootcamp.appbancomvc.repositories;

import com.bootcamp.appbancomvc.models.Sucursal;

import java.util.List;

public interface IFakeDBSucursal {
    void init();
    int add(Sucursal sucursal);
    void modify(int idSucursal, Sucursal newSucursal);
    List<Sucursal> list();
    Sucursal delete(int idSucursal);
}
