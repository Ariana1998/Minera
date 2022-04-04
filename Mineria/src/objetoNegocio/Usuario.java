/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.util.Objects;

/**
 *
 * @author darkl
 */
public class Usuario {
    
    private String tipo;
    private String nombre;
    private String usuario;
    private String Contraseña;

    public Usuario() {
    }

    public Usuario(String tipo, String nombre, String usuario, String Contraseña) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public Usuario(String usuario, String Contraseña) {
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.usuario);
        hash = 43 * hash + Objects.hashCode(this.Contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.Contraseña, other.Contraseña)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
