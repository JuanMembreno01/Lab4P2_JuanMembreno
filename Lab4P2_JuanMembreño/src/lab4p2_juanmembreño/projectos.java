/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmembreño;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class projectos {

    private String nombre;
    private String nombresolicitud;
    private String descripcion;
    private int cantañosd;
    private String estado;
    private int directoresencargados;
    private int desarroladoresencargados;
    private int consultoresencargados;

    public projectos() {
    }

    public projectos(String nombre, String nombresolicitud, String descripcion, int cantañosd, String estado, int directoresencargados, int desarroladoresencargados, int consultoresencargados) {
        this.nombre = nombre;
        this.nombresolicitud = nombresolicitud;
        this.descripcion = descripcion;
        this.cantañosd = cantañosd;
        this.estado = estado;
        this.directoresencargados = directoresencargados;
        this.desarroladoresencargados = desarroladoresencargados;
        this.consultoresencargados = consultoresencargados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombresolicitud() {
        return nombresolicitud;
    }

    public void setNombresolicitud(String nombresolicitud) {
        this.nombresolicitud = nombresolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantañosd() {
        return cantañosd;
    }

    public void setCantañosd(int cantañosd) {
        this.cantañosd = cantañosd;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDirectoresencargados() {
        return directoresencargados;
    }

    public void setDirectoresencargados(int directoresencargados) throws miexception {
        if (directoresencargados > 2) {
            throw new miexception(Color.red, "El numero maximo de Directores encargados es de 2");
        } else {
            this.directoresencargados = directoresencargados;
        }
    }

    public int getDesarroladoresencargados() {
        return desarroladoresencargados;
    }

    public void setDesarroladoresencargados(int desarroladoresencargados) throws miexception {
        if (desarroladoresencargados > 5) {
            throw new miexception(Color.red, "El numero maximo de Desarrolladores  encargados es de 5");
        } else {
            this.desarroladoresencargados = desarroladoresencargados;
        }
    }

    public int getConsultoresencargados() {
        return consultoresencargados;
    }

    public void setConsultoresencargados(int consultoresencargados) throws miexception {
        if (consultoresencargados > 3) {
            throw new miexception(Color.red, "El numero maximo de Consultores encargados es de 3");

        } else {
            this.consultoresencargados = consultoresencargados;
        }
    }

    @Override
    public String toString() {
        return "projectos{" + "nombre=" + nombre + ", nombresolicitud=" + nombresolicitud + ", descripcion=" + descripcion + ", canta\u00f1osd=" + cantañosd + ", estado=" + estado + ", directoresencargados=" + directoresencargados + ", desarroladoresencargados=" + desarroladoresencargados + ", consultoresencargados=" + consultoresencargados + '}';
    }

}
