package com.bootcamp.appbancomvc.services;

import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.repositories.IFakeDBSucursal;

import java.util.List;

public interface ISucursalService {
    void init();
    int add(Sucursal sucursal);
    void modify(int idSucursal, Sucursal newSucursal);
    List<Sucursal> list();
    Sucursal delete(int idSucursal);
}
