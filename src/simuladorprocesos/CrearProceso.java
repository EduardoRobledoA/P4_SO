/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorprocesos;
//import static java.lang.Thread.sleep;
// java.util.logging.Level;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.util.logging.Logger;
/**
 *
 * @author roble
 */
public class CrearProceso {

    public CrearProceso() {
    }
    
    /**
     *
     * @return
     */
    public Proceso Crear(){
        String nombre;
        int i;
        Scanner teclado = new Scanner(System.in);
        Proceso proceso = new Proceso();
        
        System.out.println("Ingrese el nombre del proceso: ");
        nombre = teclado.nextLine();
        proceso.setNombre(nombre);
        
        System.out.println("\n");
        for(i=0;i<3;i++){
            System.out.println("Creando " + proceso.getNombre()+"..." );
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CrearProceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Proceso "+nombre+" ha sido creado");
        this.asignacion_Id(proceso);
        this.asignacion_Instrucciones(proceso);
        this.asignacion_Memoria(proceso);
        return proceso;
    }
    
    public void asignacion_Id(Proceso proceso){
        String id;
        Random id_num = new Random();
        id = (id_num.nextInt(1000))+"_"+proceso.getNombre();
        proceso.setId_Proc(id);
        System.out.println("\nid: "+proceso.getId_Proc());
    }
    
    public void asignacion_Instrucciones(Proceso proceso){
        int instrucciones = 31;
        Random no_ins = new Random();
        
        while(instrucciones>30)
            instrucciones = (no_ins.nextInt(30)+10);
        proceso.setNo_Instrucciones(instrucciones);
        System.out.println("# inst "+proceso.getNo_Instrucciones());      
    }
    
    public void asignacion_Memoria(Proceso proceso){
        int inst = proceso.getNo_Instrucciones();
        
        if(inst<=15)
            proceso.setMemoria(64);
        else if(inst>15 && inst<=20)
            proceso.setMemoria(128);
        else if(inst>20 && inst<=25)
            proceso.setMemoria(256);
        else if(inst>25)
            proceso.setMemoria(512);
        
        System.out.println("Memoria ocupada: "+proceso.getMemoria());
    }
}