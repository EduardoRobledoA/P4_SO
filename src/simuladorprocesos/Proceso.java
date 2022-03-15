package simuladorprocesos;


import simuladorprocesos.CrearProceso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roble
 */
public class Proceso {
    String id_Proc;
    int tipo_Proc;
    int memoria;
    String nombre;
    int no_Instrucciones;
    int lugar_Cola;
            
    public Proceso() {
    }
   

    public String getId_Proc() {
        return id_Proc;
    }

    public void setId_Proc(String id_Proc) {
        this.id_Proc = id_Proc;
    }

    public int getTipo_Proc() {
        return tipo_Proc;
    }

    public void setTipo_Proc(int tipo_Proc) {
        this.tipo_Proc = tipo_Proc;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNo_Instrucciones() {
        return no_Instrucciones;
    }

    public void setNo_Instrucciones(int no_Instrucciones) {
        this.no_Instrucciones = no_Instrucciones;
    }

    public int getLugar_Cola() {
        return lugar_Cola;
    }

    public void setLugar_Cola(int lugar_Cola) {
        this.lugar_Cola = lugar_Cola;
    }
    
    
    
}
