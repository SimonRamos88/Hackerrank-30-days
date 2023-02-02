
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_2 {
    
    public double porcentaje(int por, double val){
        return (por*val)/100;
    }
    
    public void resultado(double meal, int tip, int tax){
        double total = meal + porcentaje(tip,meal) + porcentaje(tax,meal);
        System.out.printf("%.0f",total);
    }
    
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        Dia_2 xd = new Dia_2();
        xd.resultado(meal_cost,tip_percent,tax_percent);  
    }
}
