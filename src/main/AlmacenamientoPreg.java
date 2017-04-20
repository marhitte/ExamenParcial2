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
public class AlmacenamientoPreg {
    private String pregunta;
    private String RCorrecta;
    private String Inciso1;
    private String Inciso2;
    private String Inciso3;

    public AlmacenamientoPreg(String p, String rc,String I1,String I2,String I3){
        this.pregunta=p;
        this.RCorrecta=rc;
        this.Inciso1=I1;
        this.Inciso2=I2;
        this.Inciso3=I3;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRCorrecta() {
        return RCorrecta;
    }


    public void setRCorrecta(String RCorrecta) {
        this.RCorrecta = RCorrecta;
    }

    public String getInciso1() {
        return Inciso1;
    }


    public void setInciso1(String Inciso1) {
        this.Inciso1 = Inciso1;
    }

    public String getInciso2() {
        return Inciso2;
    }

    public void setInciso2(String Inciso2) {
        this.Inciso2 = Inciso2;
    }

    public String getInciso3() {
        return Inciso3;
    }

    public void setInciso3(String Inciso3) {
        this.Inciso3 = Inciso3;
    }
    
    
    @Override
    public String toString(){
        return pregunta+"\n"+RCorrecta+"\n"+Inciso1+"\n"+Inciso2+"\n"+Inciso3;
    }
    
    
    
}
