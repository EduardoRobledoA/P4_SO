package simuladorprocesos;

import simuladorprocesos.CrearProceso;

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
    int id_Memoria;
            
    public Proceso() {
    }

    public Proceso(String nombre) {
        this.nombre = nombre;
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

    public int getid_Memoria() {
        return id_Memoria;
    }

    public void setid_Memoria(int id_Memoria) {
        this.id_Memoria = id_Memoria;
    }

    @Override
    public String toString() {
        return "Proceso{" + "id_Proc=" + id_Proc + ", tipo_Proc=" + tipo_Proc + ", memoria=" + memoria + ", nombre=" + nombre + ", no_Instrucciones=" + no_Instrucciones + ", id_Memoria=" + id_Memoria + '}';
    }
    
    
    
    
}
