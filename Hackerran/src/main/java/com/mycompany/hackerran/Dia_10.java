
package com.mycompany.hackerran;

import java.util.Scanner;

public class Dia_10 {
 
    int max; // Va a guardando el numero maximo de 1s consecutivos
    int contador; // Va a contando los 1s consecutivos
    
    public Dia_10(){
        this.max = 0; 
        this.contador = 0;
    }
    /* 
        Dentro de  la recursiva dividir lo que vamios haciendo es ir 
        diviendo el numero de dos en dos para pasarlo a binario
    */
    public int Dividir (int n){       
        if(n==1){
            if(this.contador>=this.max){
                this.max = this.contador + 1;
            } 
            /* Hay que aniadir esta condicion por si la fila de 1s consecutivos esta al final
               en ese caso, al no haber 0, no hay oportunidad de comprobar si el contador ya supero
               el maximo. Por eso, si el contador supero al maximo al final, hacemos la asignacion
            */
            return this.max;
        }else{
            Contar(n);
            return Dividir(n/2);
        }      
        
    }
    /*
        si el modulo es 1 (osea, en el binario iria un 1) lo sumamos al contador
        sino, (es decir, va cero) dejamos de contarlo y vemos si lo que lleva el
        contador es mayor a lo que teniamos guardado como el maximo.
        Si el contador es mayor, ahora ese es el nuevo maximo y reiniciamos para volver a contar
        sino es mayor, simplemente reiniciamos y volvemos a contar
    */
    
    public void Contar(int n){
        if(n%2 == 1){
                this.contador += 1;
        }else{
            if(this.contador>=this.max){
                this.max = this.contador;
            }
            this.contador= 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dia_10 xd = new Dia_10();
        /*Aunque al usar la funcion dividir nos devuelve el binario invertido si lo almacenamos, 
        no es necesario hacerlo, pues el problema solo pide contar la mayor cantidad de unos consecutivos*/
        System.out.println(xd.Dividir(n));
    }
    
}
