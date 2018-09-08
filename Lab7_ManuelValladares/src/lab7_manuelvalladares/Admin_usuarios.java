/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_manuelvalladares;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mevl1
 */
public class Admin_usuarios {
     private ArrayList<USUARIO>usuarios=new ArrayList();
    private File archivo=null;
    
    public Admin_usuarios(String path){
        archivo=new File(path);
    }

    public ArrayList<USUARIO> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<USUARIO> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     //mutador extra
    public void setUsuario(USUARIO p){
        this.usuarios.add(p);
    }

    @Override
    public String toString() {
        return "Admin_usuarios{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }
     public void cargarArchivo() {
        usuarios=new ArrayList();
        USUARIO temp;
        try {
        if (archivo.exists()) {
            System.out.println(archivo.getName());
            FileInputStream entrada=new FileInputStream(archivo);
            ObjectInputStream objeto=new ObjectInputStream(entrada);
            try {//cuando leo un archivo binario de manera infinita siempre va a tirar una exception
                while ((temp=(USUARIO)objeto.readObject())!=null) {
                   usuarios.add(temp);
                    
                }
            } catch (EOFException e) {
                //encuentra final de archivo
            }
            objeto.close();
            entrada.close();
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try {
            fw=new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (USUARIO t : usuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
