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
public class Desarrolladores extends personas {
  
    private int cantpro;
    private int añosex;
    private int añoscont;
    private String lenguajefav;
    private int horastrab;
    private int sueldomesu=0;
    private int projectosasig;

    public Desarrolladores() {
    }

    public Desarrolladores(int cantpro, int añosex, int añoscont, String lenguajefav, int horastrab, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.cantpro = cantpro;
        this.añosex = añosex;
        this.añoscont = añoscont;
        this.lenguajefav = lenguajefav;
        this.horastrab = horastrab;
       
    }

    public int getCantpro() {
        return cantpro;
    }

    public void setCantpro(int cantpro) {
        this.cantpro = cantpro;
    }

    public int getAñosex() {
        return añosex;
    }

    public void setAñosex(int añosex) {
        this.añosex = añosex;
    }

    public int getAñoscont() {
        return añoscont;
    }

    public void setAñoscont(int añoscont) {
        this.añoscont = añoscont;
    }

    public String getLenguajefav() {
        return lenguajefav;
    }

    public void setLenguajefav(String lenguajefav) {
        this.lenguajefav = lenguajefav;
    }

    public int getHorastrab() {
        return horastrab;
    }

    public void setHorastrab(int horastrab) {
        this.horastrab = horastrab;
    }

    public int getSueldomesu() {
        return sueldomesu;
    }

    public void setSueldomesu(int sueldomesu) {
        this.sueldomesu = sueldomesu;   
    }

    public int getProjectosasig() {
        return projectosasig;
    }

    public void setProjectosasig(int projectosasig) {
        this.projectosasig = projectosasig;
    }
    
     public void sueldomensual(int cantpr,int cantpra,int añoscont ){
       setSueldomesu((cantpr*115000*2)/cantpra+añoscont);
    }
    @Override
    public String toString() {
        return super.toString()+ "Desarrolladores{" + "cant projectos=" + cantpro + ", años ex =" + añosex + ", años de contrato=" + añoscont + ", lenguaje favorito=" + lenguajefav + ", horastrabajadas=" + horastrab + ", sueldomesual=" + sueldomesu + '}';
    }
    
}
