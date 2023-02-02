
package com.mycompany.hackerran;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Dia_28 {
    
    // Este metodo nos da los nombres de las personas con @gmail
    public List<String>listarNombres(String[] nombres, String[] correos, String email){
        List<String> list = new ArrayList();
        for(int i=0;i<correos.length; i++){
           char[] correo = correos[i].toCharArray();
           char[] depurado = Depurar(correo);
           if( Validar(depurado,email) ){
               list.add(nombres[i]);
           }
        }
        //java.util.Collections.sort(list);
        return list.stream().sorted().collect(Collectors.toList());
    }
    
    
    // Este metodo nos dice si el email termina en @gmail.com
    
    public boolean Validar(char[] input, String email){
        String cad = "";
        for(char x: input){
            cad += x;
        }
        return cad.equals(email);
    }
    
    //Este metodo nos devuelve la direccion de correo
    public char[] Depurar(char[] email){
        int i = 0; 
        boolean bandera = true;
        /*Usamos una bandera para el caso en que no hay arroba en la cadena
        no vaya hasta el ultimo elemento y quede fuera de la longitud*/
        while( bandera && i<email.length){
            if(email[i] == '@'){
                bandera = false;
            }else{
                i ++;
            }
            
        }
        char[] extension = new char[email.length-i];
        
        for(int j = i; j<email.length;j++ ){
            extension[j-i] = email[j];
        }
        return extension;
    }
    
    public void Stringto(List<String> xd){
        for(String x: xd){
            System.out.println(x);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        Dia_28 xd = new Dia_28();
        int N = sc.nextInt();
        sc.nextLine();
        String[] nombres = new String[N];
        String[] correos = new String[N];
        while(N>0){
            String input = sc.nextLine();
            String[] in = input.split(" ");
            nombres[N-1] = in[0];
            correos[N-1] = in[1];
            N--;
        }
        xd.Stringto( xd.listarNombres(nombres, correos, "@gmail.com") );
        
        //xd.Stringto(xd.Depurar(input.toCharArray()));
        //System.out.println(xd.Validar(xd.Depurar(input.toCharArray()), "@uwu"));
    }
    
}
