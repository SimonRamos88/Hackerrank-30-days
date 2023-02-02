
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_1 {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        
        double dob = sc.nextDouble();
        sc.nextLine(); // Limpiamos el buffer para que nos lea el string
        String stri = sc.nextLine();
        System.out.println(i+num);
        System.out.printf("%.1f",d+dob);
        System.out.println("\n" + s+stri);
        
    }
    
}
