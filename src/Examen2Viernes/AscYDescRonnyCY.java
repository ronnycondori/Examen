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
public class AscYDescRonnyCY {
    
    public int[] Ascendente(int[] vector){
        int jun, man;
        for (int i = 1; i < vector.length; i++) {
            jun = vector[i];
            man = i;            
            while(man > 0 && jun < vector[man - 1]){
                vector[man] = vector[man - 1];
                man--;
            }
            vector[man] = jun;
        }
        return vector;
    }    
    public int[] Descendente(int[] vector){
        int jac, can;
        for (int i = 1; i < vector.length; i++) {
            jac = vector[i];
            can = i;
            while(can > 0 && jac > vector[can - 1]){
            vector[can] = vector[can - 1];
            can--;
            }
            vector[can] = jac;    
        }
        return vector;
    }
    public void Imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El Vector[" + i + "]= " + vector[i]);
        }
    }
    public static void Ronny(){
        double ar;
        int[] vector = {42,57,14,40,96,19,8,68,1,4};
        Scanner pon = new Scanner(System.in);
        System.out.println("Ascendente == 1 : ");
        System.out.println("Descendente == 2 : ");
        System.out.println("Precione una de las opciones: ");
        ar = pon.nextInt();
        AscYDescRonnyCY an = new AscYDescRonnyCY();
            if(ar == 1){
                an.Imprimir(an.Ascendente(vector));
            }else if(ar == 2){
                    an.Imprimir(an.Descendente(vector));
                    }
    }
    public static void main(String[] args){
        Ronny();
    }
}
