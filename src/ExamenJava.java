/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RONNY
 */
public class ExamenJava {

    /**
     * @param args the command line arguments
     */
    public int[] Ordeancion_Decreciente(int[] venc){
        int por, D;
        for (int i = 1; i < venc.length; i++) {
            por = venc[i];
            D = i;
            while(D > 0 && por > venc[D - 1]) {
                venc[D] = venc[D - 1];
                D--;                
            }
            venc[D] = por;
        }
    return venc;
    }
    
    
    public void Imprimir(int[] venc){
        for (int i = 0; i < venc.length; i++) {
            System.out.println("Descendente[" + i + "]= " + venc[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] vector = {42,57,14,40,96,19,8,68,1,4};
        ExamenJava pe = new ExamenJava();
        pe.Imprimir(pe.Ordeancion_Decreciente(vector));
    }
    
}
