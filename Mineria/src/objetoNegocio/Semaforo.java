/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.util.Objects;

/**
 *
 * @author hp
 */
public class Semaforo {
    private final String ubicacion;
    private int id;
    private boolean encendido;

    public Semaforo(String ubicacion, int id) {
        this.ubicacion = ubicacion;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
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
        final Semaforo other = (Semaforo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.ubicacion, other.ubicacion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.ubicacion);
        hash = 47 * hash + this.id;
        return hash;
    }
}
