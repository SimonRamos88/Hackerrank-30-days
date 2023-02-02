
package com.mycompany.hackerran;
import java.util.Scanner;

public class Dia_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            if(( 2<=n && n<=5) || n >20){
                System.out.println("Not Weird");
            }
            else{ // Aqui ya esta cubierto que n sea menor a 2 (osea 1), tambien debe ser mayor a 6 y menor 20 (o entraria al if de antes) 
                System.out.println("Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
