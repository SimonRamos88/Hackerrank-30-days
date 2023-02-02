
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_25 {
    
    
    public boolean esPrimo(int n){       
        int m = (int) Math.sqrt(n); // Ningun numero es divisible por un numero mayor a su raiz
        int i =  2;
        while(i<=m && n%i != 0){
            i++;
        }
        return i>m && n!= 1 ; // condicion extra por si n = 1
    }
    
    public void output(int n){
        if(esPrimo(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dia_25 xd = new Dia_25();
        int T = sc.nextInt();
        for(int i = 0; i<T;i++){
            int n = sc.nextInt();
            xd.output(n);
        }

    }
    
}
