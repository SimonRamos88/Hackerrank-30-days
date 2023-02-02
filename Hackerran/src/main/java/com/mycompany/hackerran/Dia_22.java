
package com.mycompany.hackerran;

import java.util.Scanner;
class Node{

    int data;
    Node left;
    Node right;
    
    public Node(int d){
        this.data=d;
        this.left = null;
        this.right = null;
    }
}

public class Dia_22{
    Node root;
    public Dia_22( int data){
        this.root = new Node(data);
    }
    public Node insert(Node root, int data){
     if (root == null ){
         return new Node(data);
     }
     if (data <= root.data)  {
         root.left = insert(root.left,data);
     } else {
         root.right = insert(root.right, data);
     }

     return root;
     }

    public int getHeight(Node root){
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Dia_22 xd = new Dia_22(x);
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            xd.insert(xd.root, x);
        }
        //System.out.println(list);
        System.out.println(xd.getHeight(xd.root));
        //xd.Contar(xd.root, xd.root.GetDer().isEmpty() && xd.root.GetIzq().isEmpty());
        
    }
}