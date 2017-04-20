/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pc
 */
public class DatosAlumno {
    private String nombre;
    private String id;
    private String materia;
    
    
    public DatosAlumno(String n, String i, String m){
    this.nombre=n;
    this.id=i;
    this.materia=m;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
     @Override
    public String toString(){
        return nombre+" "+id+" "+materia;
    }
    
}
