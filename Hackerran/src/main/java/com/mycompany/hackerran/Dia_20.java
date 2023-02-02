
package com.mycompany.hackerran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;


public class Dia_20 {
    
    int wraps; // Almacena la sumatoria de intercambios
    int interc; //Guarda el numero de intercambios por ciclo, cuando hay 0 intercambios es pq ya esta ordenado
    
    public Dia_20(){
        this.wraps = 0;
        this.interc = 1;
    }
    
    public List<Integer> OrdenarBurbuja(List<Integer> list, int n, int interc,int wrap){
        if(interc == 0){
            return list;
        }else{
            this.wraps = wrap; // Guardamos el wrap anterior a que estuviera ordenado
            interc = 0;
            for(int i=0; i<n-1; i++){
                if( list.get(i)>list.get(i+1) ){
                    int aux1 = list.get(i+1);
                    list.set(i+1,list.get(i));
                    list.set(i,aux1);
                    wrap += 1;
                    interc += 1;
                }
            }
            
            //System.out.println("List: " + list + " wrap: " + wrap);
            
            return OrdenarBurbuja(list,n,interc,wrap);
        }
      
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());       
        
        bufferedReader.close();
        
        Dia_20 xd = new Dia_20();
        List ordenado = xd.OrdenarBurbuja(a, n, xd.interc,xd.wraps);
        //System.out.println("current wrap: " + xd.wraps+" cuurrent interc: " + xd.interc);
        System.out.println("Array is sorted in "+ xd.wraps +" swaps.");
        System.out.println("First Element: " + ordenado.get(0));
        System.out.println("Last Element: " + ordenado.get(n-1));
    }
    
}
