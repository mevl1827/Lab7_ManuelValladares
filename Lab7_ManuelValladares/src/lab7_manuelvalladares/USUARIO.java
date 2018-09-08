/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_manuelvalladares;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author mevl1
 */
public class USUARIO implements Serializable {
    private String nombre;
    private int edad;
    private String sexo;
    private String nombre_usuario;
    private String contraseña;
    private ArrayList intereses=new ArrayList();
    private ArrayList amigos=new ArrayList();
    private ArrayList amigos_interesados=new ArrayList();
    private String descripcion;
    private Icon imagen;
    private ArrayList mensajes=new ArrayList();
    private ArrayList solicitudes=new ArrayList();
    private ArrayList bloqueados=new ArrayList();
    private ArrayList calendario=new ArrayList();//citas
    private String membresia;
    private static final long serialVersionUID=777L;
    public USUARIO() {
    }

    public USUARIO(String nombre, int edad, String sexo, String nombre_usuario, String contraseña, String descripcion, Icon imagen, String membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList intereses) {
        this.intereses = intereses;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    public ArrayList getAmigos_interesados() {
        return amigos_interesados;
    }

    public void setAmigos_interesados(ArrayList amigos_interesados) {
        this.amigos_interesados = amigos_interesados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ArrayList bloqueados) {
        this.bloqueados = bloqueados;
    }

    public ArrayList getCalendario() {
        return calendario;
    }

    public void setCalendario(ArrayList calendario) {
        this.calendario = calendario;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
