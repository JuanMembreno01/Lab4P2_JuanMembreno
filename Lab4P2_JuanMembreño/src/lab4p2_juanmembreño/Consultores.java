/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class Consultores extends personas{
     private int añoscont;
    private int cantpro;
    private String campoexperiencia;
    private int tiempodeconsultoria;
    private int sueldo=0;

    public Consultores() {
    }

    public Consultores(int añoscont, int cantpro, String campoexperiencia, int tiempodeconsultoria, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.añoscont = añoscont;
        this.cantpro = cantpro;
        this.campoexperiencia = campoexperiencia;
        this.tiempodeconsultoria = tiempodeconsultoria;
    }

    public int getAñoscont() {
        return añoscont;
    }

    public void setAñoscont(int añoscont) {
        this.añoscont = añoscont;
    }

    public int getCantpro() {
        return cantpro;
    }

    public void setCantpro(int cantpro) {
        this.cantpro = cantpro;
    }

    public String getCampoexperiencia() {
        return campoexperiencia;
    }

    public void setCampoexperiencia(String campoexperiencia) {
        this.campoexperiencia = campoexperiencia;
    }

    public int getTiempodeconsultoria() {
        return tiempodeconsultoria;
    }

    public void setTiempodeconsultoria(int tiempodeconsultoria) {
        this.tiempodeconsultoria = tiempodeconsultoria;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Consultores{" + "años contrato=" + añoscont + ", cant productos=" + cantpro + ", campo experiencia=" + campoexperiencia + ", tiempo de consultoria=" + tiempodeconsultoria + ", sueldo=" + sueldo + '}';
    }
    
}
