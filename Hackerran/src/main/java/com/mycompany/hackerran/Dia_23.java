package com.mycompany.hackerran;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nodes{

    int data;
    Nodes left;
    Nodes right;
    
    public Nodes(int d){
        this.data=d;
        this.left = null;
        this.right = null;
    }
}

public class Dia_23{
    Nodes root;
    public Dia_23( int data){
        this.root = new Nodes(data);
    }
    public Nodes insert(Nodes root, int data){
     if (root == null ){
         return new Nodes(data);
     }
     if (data <= root.data)  {
         root.left = insert(root.left,data);
     } else {
         root.right = insert(root.right, data);
     }

     return root;
     }

    public void print(Nodes root){
      Queue<Nodes> queue = new LinkedList<Nodes>();
      queue.add(root);
      while(queue.peek()!=null){
          Nodes node =queue.remove();
          System.out.print(""+node.data+" ");
          if(node.left!=null)
              queue.add(node.left);
          if(node.right!=null)
              queue.add(node.right);
      }
       
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Dia_23 xd = new Dia_23(x);
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            xd.insert(xd.root, x);
        }
        //System.out.println(list);
        xd.print(xd.root);
        //xd.Contar(xd.root, xd.root.GetDer().isEmpty() && xd.root.GetIzq().isEmpty());
        
    }
}