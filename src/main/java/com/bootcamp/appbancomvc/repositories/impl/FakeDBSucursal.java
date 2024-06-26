package com.bootcamp.appbancomvc.repositories.impl;

import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.repositories.IFakeDBSucursal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FakeDBSucursal implements IFakeDBSucursal {

    private Map<Integer, Sucursal> sucursales;
    Integer secuenciSucursal = 0;
    public  FakeDBSucursal(){
        sucursales = new HashMap<>();
    }
    @Override
    public void init() {
        sucursales = new HashMap<>();
    }

    @Override
    public int add(Sucursal sucursal) {
        secuenciSucursal++;
        sucursal.setId(secuenciSucursal);
        sucursales.put(secuenciSucursal, sucursal);
        return secuenciSucursal;
    }

    @Override
    public void modify(int idSucursal, Sucursal newSucursal) {
        sucursales.put(idSucursal, newSucursal);
    }

    @Override
    public List<Sucursal> list() {
        return new ArrayList<>(sucursales.values());
    }

    @Override
    public Sucursal delete(int idSucursal) {
        return sucursales.remove(idSucursal);
    }
}
