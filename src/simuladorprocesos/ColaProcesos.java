/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorprocesos;

import java.util.*;

/**
 *
 * @author root
 */
public class ColaProcesos {

    LinkedList<Proceso> NuevaColaProcesos = new LinkedList();
    LinkedList<Proceso> ColaProcesosFinalizados = new LinkedList();
    LinkedList<Proceso> ColaProcesosEliminados = new LinkedList();

    public void insertar_Proceso(Proceso p) {
        NuevaColaProcesos.add(p);
    }

    public void estado_actual_sistema() {
        
        System.out.println("\n >>>> Número de procesos listos:"+ NuevaColaProcesos.size());

        int i=1;
        if (ColaProcesosFinalizados.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos finalizados \n");
        } else {
            System.out.println("\n >>>> Lista de Procesos Finalizados Exitosamente: \n");
            for (Proceso temporal : ColaProcesosFinalizados) {
                
                if (i==1) {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                } else {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                }

            }
            System.out.println();
        
        }

        i=1;
        if (ColaProcesosEliminados.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos eliminados \n");
        } else {
            System.out.println("\n >>>> Lista de Procesos Eliminados: \n");
            for (Proceso temporal : ColaProcesosEliminados) {
                
                if (i==1) {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                } else {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                }

            }
            System.out.println();
        
        }

    }

    public void imprimir_cola_procesos() {

        int i=1;
        if (NuevaColaProcesos.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos preparados \n");
        } else {
            System.out.println("\n >>>> Lista de Procesos Preparados: \n");
            for (Proceso temporal : NuevaColaProcesos) {
                
                if (i==1) {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"(Proceso Activo)\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                } else {
                    System.out.println(i+"->\tNombre: "+temporal.getNombre()+"\n\tID unico: "+temporal.getId_Proc()
                    +"\n\tInstruccionesPendientes: "+temporal.getNo_Instrucciones()+"\n");
                    i++;
                }

            }
            System.out.println();
        }

    }

    public void ver_proceso_actual(){
        
        if (NuevaColaProcesos.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos preparados \n");
        } else {
            Proceso temporal = NuevaColaProcesos.getFirst();
            System.out.println("\n >>>> Proceso actual: \n");
            System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
            +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
            +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
            +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");
        }

    }

    public void ejecutar_proceso_actual(){

        int i;
        if (NuevaColaProcesos.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos preparados \n");
        } else {

            System.out.println("\n >>>>>>> Proceso activo actual: \n");
            Proceso temporal = NuevaColaProcesos.removeFirst();
            System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
            +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
            +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
            +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");

            System.out.println("\n >>>> Ejecutando proceso actual\n");
            for(i=0;i<3;i++){
                System.out.println("..." );
                try {
                    Thread.sleep(550);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            if (temporal.getNo_Instrucciones() <= 5) { //Proceso termina su ejecucion

                temporal.setNo_Instrucciones(0);
                temporal.setMemoria(0);
                ColaProcesosFinalizados.add(temporal);
                System.out.println("\n >>>> El proceso ha concluido su ejecución\n");


            } else { //Proceso vuelve a la cola

                int memoActual = temporal.getNo_Instrucciones();
                temporal.setNo_Instrucciones(memoActual-5);
                
                NuevaColaProcesos.add(temporal);
                System.out.println("\n >>>>>>> Proceso despues de ejecucion: \n");
                System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
                +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
                +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
                +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");

            }

        }

    }

    public void pasar_proceso_siguiente(){
        
        int i;
        if (NuevaColaProcesos.size()==0) {
            System.out.println("\n >>>>>>> No hay procesos preparados \n");
        } else {

            System.out.println("\n >>>>>>> Proceso activo actual: \n");
            Proceso temporal = NuevaColaProcesos.removeFirst();
            System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
            +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
            +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
            +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");

            System.out.println("\n >>>> Pasando al siguiente proceso\n");
            for(i=0;i<3;i++){
                System.out.println("..." );
                try {
                    Thread.sleep(550);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            NuevaColaProcesos.add(temporal);
            temporal = NuevaColaProcesos.getFirst();
            System.out.println("\n >>>>>>> Proceso activo actual: \n");
            System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
            +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
            +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
            +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");

        }
    }
    

    public void matar_proceso_actual(){

        int i;
        if (NuevaColaProcesos.size()==0) {
                System.out.println("\n >>>>>>> No hay procesos preparados \n");
        } else {

            System.out.println("\n >>>> Matando proceso actual \n");
            for(i=0;i<3;i++){
                System.out.println("..." );
                try {
                    Thread.sleep(550);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            System.out.println("\n >>>>>>> Se elimino el proceso: \n");
            Proceso temporal = NuevaColaProcesos.removeFirst();
            System.out.println("  Nombre:"+temporal.getNombre()+"\n"+"  ID unico:"+temporal.getId_Proc()+"\n"
            +"  Instrucciones totales:"+temporal.getNo_Instrucciones()+"\n"
            +"  Instrucciones ejecutadas:"+temporal.getNo_Instrucciones()+"\n"
            +"  Direcciones de memoria asignadas:"+temporal.getNo_Instrucciones()+"\n");
            ColaProcesosEliminados.add(temporal);

        }

    }

}
