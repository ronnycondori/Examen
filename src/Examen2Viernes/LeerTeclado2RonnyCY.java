package Examen2Viernes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LeerTeclado2RonnyCY {
    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String texto){          
        try {
            System.out.println(texto);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public String leer(String dato, String texto){       
        try {
            System.out.println(texto);
            dato=br.readLine();
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public double leer(double dato, String texto){         
        try {
            System.out.println(texto);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public char leer(char dato, String texto){         
        try {
            System.out.println(texto);
            dato=br.readLine().charAt(0);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public boolean leer(boolean dato, String texto){         
        try {
            System.out.println(texto);
            dato=Boolean.parseBoolean(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public static void ronny(){
        int O1, O2, Total = 1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca el primer numero: ");
        O1 = leer.nextInt();
        System.out.println("Ingrese la operacion: ");
        String carn = leer.next();
        System.out.println("Introdusca el segundo numero: ");
        O2 = leer.nextInt();
        
        if(null != carn) switch (carn){
        case "+": Total = O1 + O2; break;
        case "-": Total = O1 - O2; break;
        case "*": Total = O1 * O2; break;
        
        }if("/".equals(carn)){
            Total = O1 / O2;
        }
        System.out.println("El resultado es: " + O1 + " " + carn + " " + O2 + "= " + Total);
    }
    public static void main(String[] args){
        ronny();
    }
}
