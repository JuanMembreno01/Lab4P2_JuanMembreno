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
public class personaslogin {
    private String pos;
     private String usuario;
    private String contraseña;

    public personaslogin() {
    }

    public personaslogin(String pos, String usuario, String contraseña) {
        this.pos = pos;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "personaslogin{" + "pos=" + pos + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
   
    
}
