/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import objetoNegocio.Usuario;

/**
 *
 * @author darkl
 */
public class AccesoDummy implements AccesoI {
    ArrayList<Usuario> lista=new ArrayList();
    
    @Override
    public boolean accesar(String usuario, String contraseña) {
        if (lista.contains(new Usuario(usuario, contraseña))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean registrar(Usuario usuario) {
        if (lista.contains(usuario)) {
            return false;
        }
        lista.add(usuario);
        return true;
    }
    
}
