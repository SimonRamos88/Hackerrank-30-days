
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_4 {
    
    int age;
    
    public void yearPases(){
        this.age += 1;
    }
    
    public void amIOld(){
        if(this.age < 13){
            System.out.println("You are young.");
        }else if(this.age <18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }
    
    public Dia_4(int age){
        if(age>0){
            this.age = age;
        }else{
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int age = sc.nextInt();
            Dia_4 person = new Dia_4(age);
            person.amIOld();
            person.yearPases();
            person.yearPases();
            person.yearPases();
            person.amIOld();  
            System.out.print("\n");
            T--;
        }
        
    }
}
