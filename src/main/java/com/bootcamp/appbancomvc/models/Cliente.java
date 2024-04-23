package com.bootcamp.appbancomvc.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private String email;
    private String telefono;
    private String direccion;
    private int sucursalId;
    private Sucursal sucursalPrincipal;
    private List<Integer> idCuentas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id || Objects.equals(dni, cliente.dni) || Objects.equals(email, cliente.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, dni, email);
    }

}
