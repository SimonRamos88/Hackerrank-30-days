
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_14 {
    
    private int [] elements;
    public int maximumDifference;
    
    
    public Dia_14(int[] e){
        this.elements = e;
    }
    
    // Primero obtenemos el elemento mas grande y el mas pequenio del conjunto
    
    public int maximo(int n, int[] e){
        for(int x:e){
            if(x>=n){
                n = x;
            }
        }
        return n;
    }
    
    public int minimo(int n, int[] e){
        for(int x:e){
            if(x<=n){
                n = x;
            }
        }
        return n;   
    }
    
    public int abs(int n){
        if(n<0){
            n = -n;
        }
        return n;
    }
    
    public void maximunDifference(){
        int maxi = maximo(this.elements[0],this.elements);
        int min = minimo(this.elements[0], this.elements);
        this.maximumDifference = abs(maxi-min);
    }
    
    public static int[] Separar(String input, int n){
        String[] in = input.split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(in[i]);
        }
        return a;
  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int[] e = Dia_14.Separar(input,n);
        Dia_14 xd = new Dia_14(e);
        xd.maximunDifference();
        System.out.println(xd.maximumDifference);
    }
    
}
