
package com.mycompany.hackerran;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Dia_8 {
    
    private int i;
    
    public Dia_8(){
        this.i = 0;
    }
    
    public void setI(int i){
        this.i = i;
    }
    
    public void Encontrar(Map<String,String> map, String name){
       String value = map.get(name);
       if(Objects.isNull(value)){
           System.out.println("Not found");
       }else{
           System.out.println(name+"="+value);
       }
    }
    
    public String Separar(String input){
        char[] in = input.toCharArray();
        String cad = "";
        while(this.i<in.length && in[this.i]!=' '){
            cad += in[this.i];
            this.i ++;
        }
        if(this.i< in.length){ //Si esto es verdad, es pq el ciclo se rompio pq topamos con un caracter espacio
            this.i++;
        }
        return cad;
    
    }
    
    public String[] Procesar(String input){
        int cont = 0;
        String[] procesado = new String[2];
        while(cont<2){
            String cad = Separar(input);
            procesado[cont] = cad;
            cont ++;
        }
        return procesado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //Limpiamos el scanner
        Dia_8 xd = new Dia_8();
        Map<String, String> map = new HashMap<>();
        /*String[] x = xd.Procesar(input);
        for(String e: x){
            System.out.println(e);
        }*/
        
        while(n>0){
            String input = sc.nextLine();
            String [] x = xd.Procesar(input); // separarmos el input por el nombre y el numero
            map.put(x[0],x[1]); //Ponemos las entradas en el diccioanrio
            xd.setI(0); // Reiniciamos el i a 0 para uuna nueva cadena
            n--;
        }
        while(sc.hasNextLine()){ // como hay desconocidas consultas, paramos cuando no haya más consultas
            String request = sc.nextLine();
            xd.Encontrar(map,request); //Aqui lo buscamos
            
        }
    }
    
    
}
