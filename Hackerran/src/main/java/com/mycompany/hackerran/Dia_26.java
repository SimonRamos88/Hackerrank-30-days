
package com.mycompany.hackerran;
import java.util.Scanner;

public class Dia_26 {
    int[] returnedDate;
    int[] expectedDate;
    
    public Dia_26(int[] returned, int[] expected){
        this.returnedDate = returned;
        this.expectedDate = expected;
    }
    
    public void multar(){
        if(this.returnedDate[2]>this.expectedDate[2]){
            System.out.println("10000");
        }
        else if(this.returnedDate[1]>this.expectedDate[1] && this.returnedDate[2]>=this.expectedDate[2]){
            int fine = 500*(this.returnedDate[1]-this.expectedDate[1]);
            System.out.println(fine);
        }else if(this.returnedDate[0]>this.expectedDate[0] && this.returnedDate[1]>=this.expectedDate[1] && this.returnedDate[2]>=this.expectedDate[2]){
            int fine = 15*(this.returnedDate[0]-this.expectedDate[0]);
            System.out.println(fine);
        }else{
            System.out.println("0");
        }
    }
    
    /* SOLUCION MAS ELEGANTE
    public void multar(){
        if(this.returnedDate[2]<this.expectedDate[2]){
            System.out.println("0");
        }else if(this.returnedDate[2]==this.expectedDate[2]){
            if(this.returnedDate[1]<this.expectedDate[1]){
                System.out.println("0");
            }else if(this.returnedDate[1]==this.expectedDate[1]){
                if(this.returnedDate[0]<this.expectedDate[0]){
                    System.out.println("0");
                }else if(this.returnedDate[0]==this.expectedDate[0]){
                    System.out.println("0");
                }else{
                    int fine = 15*(this.returnedDate[0]-this.expectedDate[0]);
                    System.out.println(fine);
                }
    
            }else{
                int fine = 500*(this.returnedDate[1]-this.expectedDate[1]);
                System.out.println(fine);
            }
        }else{
            System.out.println("10000");
        }
        
    }
    
    
    
    */
    
    public static int[] convertir(String[] cadena){
        int[] num = new int[3];
        for(int i =0; i<3; i++){
            int n = Integer.parseInt(cadena[i]);
            num[i] = n;
        }
        return num;
    }
    
    public void Stringto(int[] num){
        String cad = "[ ";
        for(int x: num){
            cad += x+ " ";
        }
        cad += " ]";
        System.out.println(cad);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] returnedS = sc.nextLine().split(" ");
        String[] expectedS = sc.nextLine().split(" ");
        Dia_26 xd = new Dia_26(Dia_26.convertir(returnedS),Dia_26.convertir(expectedS));
        xd.multar();
        
    }
    
}
