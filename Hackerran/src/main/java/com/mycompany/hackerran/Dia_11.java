
package com.mycompany.hackerran;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import static java.util.stream.Collectors.toList;



public class Dia_11 {
    
    private int max; //Guarda el hourglass mayor
    private int contador; // Va guardando cada hourglass
    
    public Dia_11(){
        this.contador = 0;
        this.max = 0;
    }

    public void navegar( List<List<Integer>> arr ){
        //j es para las filas, i columnas y k sub-columnas del hourglass
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                for(int k = i;k<i+3;k++){
                    this.contador += arr.get(j).get(k) + arr.get(j+2).get(k) ;
                    if(k == i+1){ // Si el la columna de la mitad, sumamos solo el elemento de la fila de la mitad (para tener la forma del hourglass)
                        this.contador += arr.get(j+1).get(k) ;
                    }
                }
                if( this.contador > this.max || (j==0 && i ==0) ){ 
/*Si el nuevo hourglass ahora es mayor que el maximo, lo guardamos como maximo, 
el j == i==0 controla que al final del primer ciclo el contador sea igual al maximo, 
                    esto si hay valores iniciales negativos*/ 
                    this.max = this.contador;
                }
                
                this.contador = 0; //reiniciamos el contador
            }
        }
        
        System.out.println(this.max); //Imprimimos el maximo
            
    }

    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        Dia_11 xd = new Dia_11();
        xd.navegar(arr);
    }
    
}
