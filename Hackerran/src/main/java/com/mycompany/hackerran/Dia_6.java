
package com.mycompany.hackerran;
import java.util.Scanner;

public class Dia_6 {
    
    public void separar(char[]palabra,int len){
        String par = "";
        String impar = "";
        int i = 0;
        while(i<len){          
            if(i%2==0){
                par+= palabra[i];
            }else{
                impar+= palabra[i];
            }
            i++;
        }
        System.out.println(par+" "+impar);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        Dia_6 xd = new Dia_6();
        while(T>0){
            String str = sc.nextLine();
            char[] palabra = str.toCharArray();
            xd.separar(palabra,palabra.length);
            T--;
        }
    }
    
}
