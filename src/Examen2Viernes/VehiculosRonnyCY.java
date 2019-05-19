/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Viernes;

import java.util.Scanner;

/**
 *
 * @author RONNY
 */
public class VehiculosRonnyCY {
    public static void Impuestos(){
        int nam = 1, jan, jons;
        double clave1 = 1, clave2 = 1, clave3 = 1, Total = 1;
        
        Scanner leer = new Scanner(System.in);
        
        while(nam <= 3){
            System.out.println("Introdusca el numero de categoria que desea averiguar: ");
            jan = leer.nextInt();
            
            System.out.println("Ingrese el costo de la categoria " + jan);
            jons = leer.nextInt();
            
            if(jan == 1){
                clave1 = jons * 0.10;
            }else if(jan == 2){
                    clave2 = jons * 0.07;
                    }else if(jan == 3){
                            clave3 = jons * 0.05;
                            }
            nam++;
            Total = clave1 + clave2 + clave3;
        }
        System.out.println("El impuesto a pagar del primer auto clave 1; es: " + clave1);
        System.out.println("El impuesto a pagar del Segundo auto clave 2, es: " + clave2);
        System.out.println("El impuesto a pagar del tercer auto clave 3, es: " + clave3);
        System.out.println("El Impuesto total a pagar es: " + Total);
    } 
}
