
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //List<Integer> list = new java.util.ArrayList<Integer>();
        ListaEnlazada list = new ListaEnlazada();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            list.borrarDuplicado(x);
        }
        list.Stringto();
    }
}

class ListaEnlazada{

    private Node head;
    
    public boolean empty(){
        return head == null;
    }
    
    /* Aniadimos nuevos elementos al final de la lista, modificaremos este metodo
    para que solo nos aniada un elemento si no esta previamente*/
    public void push(int data){
        Node n = new Node(data);
        if(empty()){
        this.head = n;
        }else{
            Node aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(n);
        }     
    }
    
    public void borrarDuplicado(int data){
        Node n = new Node(data);
        if(empty()){
            this.head = n;
        }else{
            Node aux = head;
            while(aux.getNext() != null && aux.getData() != data){
                aux = aux.getNext();
            }
            if(aux.getData() != data){ 
            /* Debemos saber si el cilo se rompio pq se llego al final de la lista o 
            si es pq hallamos dos iguales. Asi que, como pude haberse roto por llegar al final
            validamos de nuevo que sean diferntes antes de aniadirlo*/
                aux.setNext(n);
            }
            
        }
        
    }
    
    public void Stringto(){
        String cad = "";
        Node aux = head;
        while(aux.getNext() != null){
            cad += aux.getData() + " ";
            aux = aux.getNext();
        }
        cad += aux.getData();
        System.out.println(cad);
    }
    
    
}

class Node{
    private int data;
    private Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
     public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


}