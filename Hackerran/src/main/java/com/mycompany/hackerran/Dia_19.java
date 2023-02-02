
package com.mycompany.hackerran;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Dia_19 implements AdvancedArithmetic{
    
    public List<Integer> GetDivisores(int n){
        List<Integer> divisores = new ArrayList<Integer>();
        int div = 1;
        while(div<=n){
            if(n%div == 0){
                divisores.add(div);
            }
            div ++;        
        }      
        return divisores;
    }
    
    
    public int divisorSum(int n){
        List<Integer> divisores = GetDivisores(n);
        int sum = 0;
        for(int x: divisores){
            sum += x;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dia_19 xd = new Dia_19();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(xd.divisorSum(n));
    }
    
}

interface AdvancedArithmetic{

    public int divisorSum(int n);
}