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

public class Categorias {
    
    
    public static void main(String args[]){

    
        int Precio, inc = 1;
        double valor1 = 1, valor2 = 1, valor3 = 1, Total = 1;
        
        Scanner por = new Scanner(System.in);
        
        while(inc <= 3){
            System.out.println("Ingrese la categoria perteneciente: ");
            int in1 = por.nextInt();
            
            System.out.println("Ingrese el precio de la categoria: "+ + in1);
            int in2 = por.nextInt();
            
            if(in1 == 1){
                valor1 = in2 * 0.10;
            }else if(in1 == 2){
                    valor2 = in2 * 0.07;
                    }else if(in1 == 3){
                            valor3 = in2 * 0.05;
                            }
            inc++;
            Total = valor1 + valor2 + valor3;
        }
        System.out.println("El impuesto a pagar del vehiculo calve 1, es: " + valor1);
        System.out.println("El impuesto a pagar del vehiculo calve 2, es: " + valor2);
        System.out.println("El impuesto a pagar del vehiculo calve 3, es: " + valor3);
        
    }
}

