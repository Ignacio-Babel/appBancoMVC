package com.bootcamp.appbancomvc.services.impl;

import com.bootcamp.appbancomvc.models.Sucursal;
import com.bootcamp.appbancomvc.repositories.IFakeDBSucursal;
import com.bootcamp.appbancomvc.services.ISucursalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService implements ISucursalService {

    private final IFakeDBSucursal fakeDBSucursal;

    public SucursalService(IFakeDBSucursal fakeDBSucursal){
        this.fakeDBSucursal = fakeDBSucursal;
    }

    @Override
    public void init() {
        fakeDBSucursal.init();
    }

    @Override
    public int add(Sucursal sucursal) {
        return this.fakeDBSucursal.add(sucursal);
    }

    @Override
    public void modify(int idSucursal, Sucursal newSucursal) {
        this.fakeDBSucursal.modify(idSucursal, newSucursal);
    }

    @Override
    public List<Sucursal> list() {
        return this.fakeDBSucursal.list();
    }

    @Override
    public Sucursal delete(int idSucursal) {
        return this.fakeDBSucursal.delete(idSucursal);
    }
}
