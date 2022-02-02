package com.Demo.SpringBootDemo.Models;

import javax.persistence.*;

@Entity
@Table(name="Usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    private String Nombre;
    private String email;
    private boolean EstaHabilitado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstaHabilitado() {
        return EstaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        EstaHabilitado = estaHabilitado;
    }
}
