package com.bootcamp.appbancomvc.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sucursal {
    private int id;
    private String nombre;
    private String director;
    private String direccion;

    @Override
    public String toString() {
        return "Sucursal: "+nombre+" "+director+" "+direccion;
    }
}
