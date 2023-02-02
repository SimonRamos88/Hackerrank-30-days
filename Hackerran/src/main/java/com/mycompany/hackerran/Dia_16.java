
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_16 {
    
    public void Validar(String input){
        try{
            int n = Integer.parseInt(input);
            System.out.println(n);
        }catch(NumberFormatException ex){
            System.out.println("Bad String");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Dia_16 xd = new Dia_16();
        xd.Validar(input);
        
    }
}
