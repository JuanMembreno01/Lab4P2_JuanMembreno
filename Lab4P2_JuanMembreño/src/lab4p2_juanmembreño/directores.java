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
public class directores extends personas{
    private int añospuesto;
    private int añoscont;
    private int desarolladoreasig;
    private int cantpro;
    private int sueldomen=0;

    public directores() {
    }
    
    public directores(int añospuesto, int añoscont, int desarolladoreasig, int cantpro, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.añospuesto = añospuesto;
        this.añoscont = añoscont;
        this.desarolladoreasig = desarolladoreasig;
        this.cantpro = cantpro;
    }

    public int getAñospuesto() {
        return añospuesto;
    }

    public void setAñospuesto(int añospuesto) {
        this.añospuesto = añospuesto;
    }

    public int getAñoscont() {
        return añoscont;
    }

    public void setAñoscont(int añoscont) {
        this.añoscont = añoscont;
    }

    public int getDesarolladoreasig() {
        return desarolladoreasig;
    }

    public void setDesarolladoreasig(int desarolladoreasig) {
        this.desarolladoreasig = desarolladoreasig;
    }

    public int getCantpro() {
        return cantpro;
    }

    public void setCantpro(int cantpro) {
        this.cantpro = cantpro;
    }

    public int getSueldomen() {
        return sueldomen;
    }

    public void setSueldomen(int sueldomen) {
        this.sueldomen = sueldomen;
    }

    @Override
    public String toString() {
        return "directores{" + "años en el puesto=" + añospuesto + ", años de contrato=" + añoscont + ", desarolladore asig=" + desarolladoreasig + ", cant projectos=" + cantpro + ", sueldomen=" + sueldomen + '}';
    }
    
}
