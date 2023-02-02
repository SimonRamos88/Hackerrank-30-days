
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_21 <T>{
    public void printArray(T[] array){
        for(T x:array){
            System.out.println(x);
        }
    }
   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        Dia_21 xd = new Dia_21();
        xd.printArray( intArray  );
        xd.printArray( stringArray );
    } 
    
}
