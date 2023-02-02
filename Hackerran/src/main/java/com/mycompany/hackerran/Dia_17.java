
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_17 {
    
    public static String[] Separar(String input){
        String[] separado = input.split(" "); 
        return separado;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0){
            String input = sc.nextLine();
            String[] in = Dia_17.Separar(input);
            // Atrapamos la excepcion que lanzamos en el metodo power
            try{
                int res = Calculator.Power(Integer.parseInt(in[0]),Integer.parseInt(in[1]));
                System.out.println(res);
            }catch(ExcepcionNegativa ex){
                System.out.println("n and p should be non-negative");
            }
            
            T--;
        }
        
    }
}

class Calculator{

    public static int Power(int n, int p) throws ExcepcionNegativa{
        if(n<0 || p<0){
            // Definimos en que condicion se va a lanzar la excepcion que creamos
           throw new ExcepcionNegativa("n and p should be non-negative");
        }
        int res = 1;
        
        while(p>0){
            res = res*n;
            p--;
        }
        
        return res;  
    }
}

// Creamos nuestra excepcion
class ExcepcionNegativa extends Exception{

    public ExcepcionNegativa(String mensaje){
        super(mensaje);
    }
}
