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
public class Exam {
    private String materia;
    private String tipoex;
    private String Carrera;
    private Integer totalp;
    private Integer maxim;
   
    
   
    Exam(){
        
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the tipoex
     */
    public String getTipoex() {
        
        return tipoex;
    }

    /**
     * @param tipoex the tipoex to set
     */
    public void setTipoex(String tipoex) {
        this.tipoex = tipoex;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the totalp
     */
    public Integer getTotalp() {
        return totalp;
    }

    /**
     * @param totalp the totalp to set
     */
    public void setTotalp(Integer totalp) {
        this.totalp = totalp;
    }

    /**
     * @return the maxim
     */
    public Integer getMaxim() {
        return maxim;
    }

    /**
     * @param maxim the maxim to set
     */
    public void setMaxim(Integer maxim) {
        this.maxim = maxim;
    }
   
     @Override
    public String toString(){
      return materia+"\n"+tipoex+"\n"+ Carrera +"\n"+totalp+"\n"+ maxim;
    }
    
}
