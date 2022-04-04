/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import objetoNegocio.Usuario;

/**
 *
 * @author darkl
 */
public interface AccesoI {
  
    public boolean accesar(String usuario, String contraseña);
    public boolean registrar(Usuario usuario);
    
    
}
