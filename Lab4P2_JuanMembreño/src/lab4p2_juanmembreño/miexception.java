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
public class miexception extends Exception {
    private Color color;
    private String mensaje;

    public miexception() {
    }

    public miexception(Color color, String mensaje) {
        super(mensaje);
        this.color = color;
        this.mensaje = mensaje;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "miexception{" + "color=" + color + ", mensaje=" + mensaje + '}';
    }
    
}
