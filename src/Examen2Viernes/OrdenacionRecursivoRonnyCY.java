/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Viernes;

/**
 *
 * @author RONNY
 */
public class OrdenacionRecursivoRonnyCY {
    public static void main(String[] args){
        OrdenacionRecursivo2RonnyCY al = new OrdenacionRecursivo2RonnyCY();
        int vector[] = {51,11,8,45,67,31,9,56};
        al.OrdenamientoRecursivo(vector, 0, vector.length - 1);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + ".");
        }
    }
}
