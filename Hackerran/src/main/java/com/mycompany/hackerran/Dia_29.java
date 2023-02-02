
package com.mycompany.hackerran;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//ESTA SOLUCION EN CLASE 29 DA TIMEOUT ERROR, LA SOLUCION DEFINITIVA ESTA EN LA CLASE SOLUTION
class Dia_29 {
    
    
    public int decimal(List<Integer> bin){
        int dec = 0;
        //No va a ser necesario voltear el binario para pasarlo a decimal
        int n = bin.size();
        if(n!=0){
            //Recorremos el arrgelo al reves (ya que el binario esta voletado)
            for(int i=n; i>0; i--){
                /*tomamos el ultimo dela rreglo (q en realidad seria el primer digito binario
                y lo multiplicamos por la potencia de dos correspondiente*/
                int pot = (int) Math.pow(2,i-1);
                dec += bin.get(i-1)*pot;
                //System.out.println("Dec: "+ dec);
                //System.out.println("el: " + bin.get(i-1));
                //System.out.println("pot: " + pot);
                //System.out.println("i: " + i);
                //System.out.println("n: " + n);
                //System.out.println("-------");
            }
        }
        return dec;
    }
    
    
    //Nos hace el AND entre dos numeros binarios
    public List<Integer> operadorAnd(List<Integer> list1, List<Integer> list2){
        List<Integer> sol = new ArrayList();
        int n = list2.size();
        if(list1.size() < list2.size()){
            /*Cuando comparamos dos listas de diferente tamanio, recorremos hasta la que tenga menos,
            pues ya que si quisieramos ponerla de igual tamanio tendriamos que llenar de ceros.
            Pero esos ceros no nos interesan pq harian que toda la expresion de ahi en adelante de 0 en la operacion and*/
            n = list1.size();
        }
        for(int i=0; i<n; i++){
            int num1 = list1.get(i);
            int num2 = list2.get(i);
            if(num1==1 && num2 ==1){
                sol.add(1);
            }else{
                sol.add(0);
            }
        }
        return sol;
     }
    
    //Este me da el entero convertido a binario, pero el binario esta al reves 
    
    public List<Integer> binario(int n){
        List<Integer> list = new ArrayList();
        while(n>=1){
            list.add(n%2);
            n = n/2;
        }
        return list;
    }
    
    public int performance(int i, int j){
        List<Integer> bin1 = binario(i);
        List<Integer> bin2 = binario(j);
        List<Integer> binAND = operadorAnd(bin1,bin2);
        return decimal(binAND);
    }

    public int bitwiseAnd(int N, int K) {
        int res = 0;
        //System.out.println(N + "-" +K);
        //Este ciclo nos permite hacer las comparaciones entre los elementos del conjunto
        for(int i=1; i<N; i++){
            //System.out.println("Condicion: " + (i<N) );
            for(int j=i+1; j<=N; j++){
                //System.out.println("Corriendo: " + i+"-" +j);
                int aux = performance(i,j);
                if(aux>res && aux<K){
                    res = aux;
                }
            }
        }
        return res;

    }
    public static void main(String[] args){
        Dia_29 xd = new Dia_29();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        //System.out.println(xd.bitwiseAnd(5, 2));
        for(int i=T; i>0; i--){
            String input = sc.nextLine();
            String[] in = input.split(" ");
            int res = xd.bitwiseAnd(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
            System.out.println(res);
        }
    }


}

class Solution{
    
    public int bitwiseAnd(int N, int K) {
        int res = 0;
        //System.out.println(N + "-" +K);
        //Este ciclo nos permite hacer las comparaciones entre los elementos del conjunto
        for(int i=1; i<N; i++){
            //System.out.println("Condicion: " + (i<N) );
            for(int j=i+1; j<=N; j++){
                //System.out.println("Corriendo: " + i+"-" +j);
                int aux = i&j;
                if(aux>res && aux<K){
                    res = aux;
                }
            }
        }
        return res;

    }
    
    public static void main(String[] args) {
        Solution xd = new Solution();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=T; i>0; i--){
            String input = sc.nextLine();
            String[] in = input.split(" ");
            int res = xd.bitwiseAnd(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
            System.out.println(res);
        }
    }

}

 