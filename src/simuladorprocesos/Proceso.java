package simuladorprocesos;

import simuladorprocesos.CrearProceso;

/**
 *
 * @author roble
 */
public class Proceso {
    String id_Proc;
    int memoria;
    String nombre;
    int no_Instrucciones;
    int no_InstuccionesEjecutadas = 0;
    int dirBase;
    int dirLimite;
            
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
    
    public int getNo_InstruccionesEjecutadas() {
        return no_InstuccionesEjecutadas;
    }

    public void setNo_InstruccionesEjecutadas(int no_Instrucciones) {
        this.no_InstuccionesEjecutadas = no_Instrucciones;
    }

    public int getDirBase() {
        return dirBase;
    }

    public void setDirBase(int dirBase) {
        this.dirBase = dirBase;
    }

    public int getDirLimite() {
        return dirLimite;
    }

    public void setDirLimite(int dirLimite) {
        this.dirLimite = dirLimite;
    }
    
    
}
