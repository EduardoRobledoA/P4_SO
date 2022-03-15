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
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(CrearProceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Proceso "+nombre+" ha sido creado");
        
        return proceso;
    }
    
    public void Asignacion_Id(Proceso proceso){
        String id;
        Random id_num = new Random();
        id = (id_num.nextInt(70))+"_"+proceso.getNombre();
        proceso.setId_Proc(id);
        
        System.out.println("\nid: "+proceso.getId_Proc());
    }
}