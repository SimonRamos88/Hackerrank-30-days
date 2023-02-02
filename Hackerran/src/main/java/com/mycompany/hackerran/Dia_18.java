
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_18 {
    
    private char[] input;
    private Queue cola;
    private Stack pila;
    
     public String toString(){
            String cad = "[";
            for(int x: this.input){
                cad+=(char) x + " ";
            }
            cad += "]";
            return cad;
        }
    public Dia_18(char[] input){
        this.input = input;
        this.cola = new Queue(input.length);
        this.pila = new Stack(input.length);
    }
    
    public void llenar(){
        for(char x:this.input){
            this.cola.enqueueCharacter(x);
            this.pila.pushCharacter(x);
        }
    }
    
   public boolean Comparar(){
       int i = 0;
       int n = this.input.length;
       llenar();
       while( (this.cola.deenqueueCharacter() == this.pila.popCharacter()) && i<n){
           //System.out.println("Entro: " + i);
           i++;
       }
       
       return i>=n;
   }
   
   public String Output(boolean pal, String input){
       String cad = "";
       if(pal){
           cad = "The word, " +input+", is a palindrome." ;
       }else{
           cad = "The word, " +input+", is not a palindrome." ;
       }
       return cad;
   }
    
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] input =  in.toCharArray();
        Dia_18 xd = new Dia_18(input);
        boolean pal = xd.Comparar();
        //xd.llenar();
        /*
        int n = input.length;
        while(n>0 ){
            System.out.println("pop: " + xd.pila.popCharacter());
            System.out.println("enqu: " + xd.cola.deenqueueCharacter());
            n --;
        }*/
        //System.out.println("Input: " + xd.toString());
        System.out.println(xd.Output(pal, in));
        
    }
}

class Queue{
    
    private int head;
    private int tail;
    private int count;
    private int size;
    private char[] array;
    
    public Queue(int size){
        this.size = size;
        this.array = new char[size];
        this.count = 0;
        this.tail = 0;
        this.head = 0;
        }
        
        public boolean full(){
            return this.size == this.count;
        }
        
        public boolean empty(){
            return this.count == 0;       
        }
        
        public void enqueueCharacter(char ch){
            if(!full()){
                this.array[this.tail] =  ch;
                this.tail = (tail+1)%this.size;
                this.count ++;
            }
        }
        
        public char deenqueueCharacter(){
            char ch = ' ';
            if(!empty()){
                ch = (char) this.array[this.head];
                this.head = (this.head+1)%this.size;
                this.count --;
            }
            return ch;
        }
        
        public String toString(){
            String cad = "[";
            for(int x: this.array){
                cad+=x + " ";
            }
            cad += "]";
            return cad;
        }
    }
    



class Stack{
    private int size;
    private int cont;
    private char[] array;
    
    public Stack(int size){
        this.size = size;
        this.cont = 0;
        this.array = new char[size];
    }
    
    public boolean empty(){  
        return this.cont ==0;
    }
    
    public boolean full(){
        return this.cont == this.size;
    }
    
    public void pushCharacter(char ch){
        if(!full()){
            this.array[this.cont] =  ch;
            this.cont ++;
        }
    }
    
    public char popCharacter(){
        char ch = ' ';
        if(!empty()){
            this.cont--;
            ch = (char) this.array[this.cont];
            
        }
        return ch;
    }
     public String toString(){
            String cad = "[";
            for(int x: this.array){
                cad+=x + " ";
            }
            cad += "]";
            return cad;
        }
    

}