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
import java.util.Arrays;

public class BusquedaBinariaRecursivaRonnyCY {
    public static void main(String[] args){
        int[] arrans = {10,17,33,61,9,11,86,39,71,21,99};
            Arrays.sort(arrans);
            
            System.out.println(Arrays.toString(arrans));
            System.out.println(busca(arrans, 9));
            System.out.println(busca(arrans, 39));
            System.out.println(busca(arrans, 99));   
    }
    private static int busca(int[] array, int lan){
        return BusquedaBinariaRecursivaRonnyCY(array, 0, array.length - 1, lan);
    }
    private static int BusquedaBinariaRecursivaRonnyCY(int[] arran, int menor, int mayor, int lon){
        int median = (mayor + menor)/2;
        int valrmedio = arran[median];
        if(menor > mayor){
            return -1;
        }else if(valrmedio == lon){
                return median;
                }else if(valrmedio < lon){
                        return BusquedaBinariaRecursivaRonnyCY(arran, median + 1, mayor, lon);
                        }else{
                            return BusquedaBinariaRecursivaRonnyCY(arran, menor, median - 1, lon);
                }
    }
}
