/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorprocesos;

import java.util.ArrayList;
/**
 *
 * @author roble
 */
public class Memoria {
    public ArrayList<Proceso> mem = new ArrayList();
    public int capacidad ;

    public Memoria() {
    }

    public Memoria(int capacidad) {
        this.capacidad = capacidad;
    }

    public void insertar_Proceso(Proceso p){
        mem.add(p);
    }
    public ArrayList<Proceso> getMemoria() {
        return mem;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Memoria{" + "memoria=" + mem + ", capacidad=" + capacidad + '}';
    }
    
    
    

    
} 
