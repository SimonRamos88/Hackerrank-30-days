
package com.mycompany.hackerran;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class Dia_7 {
    
    public static void main(String[] args)throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        String str = "";
        while(n>0){
            str += arr.get(n-1)+ " ";
            n--;
        }
        System.out.println(str);

        
    }
    
}
