/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Viernes;

import java.util.Scanner;

public class DeterminarMesRonnyCY {
    
    public int Busqueda(int[] en, int VaA){
        int lugr = 0;
        for (int i = 0; i < en.length; i++) {
            if(en[i] == VaA){
                lugr = i;
                break;
            }else{
            } 
        }
        return lugr;
    }
    public int numero(int Num){
        return Num;
    }
    public static void Imprimir(String[] args){
        DeterminarMesRonnyCY ron = new DeterminarMesRonnyCY();
        int[] vector = {1,10,9,8,11,7,6,12,2,3,4,5};
        Scanner na = new Scanner(System.in);
        System.out.println("Ingrese el numero de posicion del mes para buscarlo: ");
        int E = na.nextInt();
        System.out.println("El mes " + E + ", fue ubicado en la posicion " + ron.Busqueda(vector, E) + ", del vector. ");
    }
    public static void main(String[] args){
        Imprimir(args);
    }
}
