/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Viernes;

import java.util.Scanner;

public class MenuDeOpcionesRonnyCY {
    public static void main(String[] args){
        System.out.println("INGRESE LA OPCIÓN DE ALGORITMO QUE DESEA PROBAR");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        while (Opcion! = 0){
            switch(Opcion){ 
                
            case 1: VehiculosRonnyCY.Impuestos();break;
            case 2: AscYDescRonnyCY.Ronny(); break;
            case 3: DeterminarMesRonnyCY.Imprimir(); break;
            case 4: LeerTeclado2RonnyCY.ronny();break;
            
            default: System.out.println("Opcion Invalida!! "); break;
            }
            System.out.println("INGRESE LA OPCIÓN DE ALGORITMO QUE DESEA PROBAR");
            opcion = leer.nextInt();
        }
        
    }
}
