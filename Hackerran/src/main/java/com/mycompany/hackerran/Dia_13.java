
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        MyBook xd = new MyBook(title, author, price);
        xd.Display();
    }
    
}


abstract class Book{

    public void Display(){};
}

class MyBook extends Book{
    
    String title;
    String author;
    int price;
    
    public MyBook(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void Display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
    
    
}
