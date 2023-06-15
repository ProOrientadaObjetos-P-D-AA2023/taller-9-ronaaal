/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoherencia;

/**
 *
 * @author UTPL
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String nombre, String siglas){
        this.nombre = nombre;
        this.siglas = siglas;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
        
}
