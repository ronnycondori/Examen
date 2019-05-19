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
public class OrdenacionRecursivo2RonnyCY {
    public void OrdenamientoRecursivo(int[] vector, int izquierda, int derecha){
        
        int pivote = vector[izquierda]; 
        int all = izquierda;
        int jon = derecha;
        int aux;
        
        while(all < jon){
            if (vector[all] <= pivote && all < jon){
                all++;
            }
            if (vector[jon] > pivote){
                jon--;
            }
            if(all < jon){
                aux = vector[all];
                vector[all] = vector[jon];
                vector[jon] = aux;
            }
        }
            vector[izquierda] = vector[jon];
            vector[jon] = pivote;
    
        if(izquierda < jon-1){
            OrdenamientoRecursivo(vector, izquierda, jon - 1);
    
            if(jon + 1 < derecha){
                OrdenamientoRecursivo(vector, jon + 1, derecha);
            }    
        }
    }
}    
