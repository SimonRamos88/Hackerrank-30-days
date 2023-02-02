
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_15 {
    
    Node head;
    
    public void Insert(Node head, int data){
        Node n = new Node(data);
        if(head == null){
            this.head = n;
        }else{
            Node aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(n);
        }
    }
    
    public String Output(Node head){
        String cad = "";
        while(head.getNext() != null){
            cad += head.getData() + " ";
            head = head.getNext();
        }
        cad += head.getData();
        return cad;
    }
    
    public Dia_15(){
        this.head = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int T = sc.nextInt();
        Dia_15 xd = new Dia_15();
        while(T>0){
            int data = sc.nextInt();
            xd.Insert(xd.head, data);
            T--;
        }
        System.out.println(xd.Output(xd.head));
    }
    
}

class Node{
    private int data;
    private Node next;
    
    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    
    public int getData(){
        return this.data;
    }
    
    public Node getNext(){
    
        return this.next;
    }
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
}