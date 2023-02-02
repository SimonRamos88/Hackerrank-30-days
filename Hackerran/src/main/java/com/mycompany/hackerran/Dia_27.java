
package com.mycompany.hackerran;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Dia_27 {
    
    public static int minimun_index(List<Integer> seq) throws Excepcion{
        if(seq.size() == 0){
            throw new Excepcion("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx=0;
        for(int i=0; i<seq.size();i++){
            if(seq.get(i) < seq.get(min_idx)){
                min_idx = i;
            }
        }
        return min_idx;
    }
    
   public static void main(String[] args){
        System.out.println("OK");
    }
    
}




class Excepcion extends Exception{
    public Excepcion(String mensaje){
        super(mensaje);
    }
}

class TestDataEmptyArray{
    
    public List<Integer> get_array(){
        return new ArrayList<Integer>();
    }
}
class TestDataUniqueValues{
    
    public List<Integer> get_array(){
        List<Integer> list = Arrays.asList(1,2,2,5,6,7,5);
        return list;
    }
    
    public void get_expected_result() {
        try{
            List<Integer> list = get_array();
            int min_idx = Dia_27.minimun_index(list);
            System.out.println(min_idx);
        }catch(Excepcion ex){
            System.out.println("\"Cannot get the minimum value index from an empty sequence\"");
        }
    }
}


class TestDataExactlyTwoDifferentMinimums{
    public List<Integer> get_array(){
        List<Integer> list = Arrays.asList(1,2,2,5,2,2,5);
        return list;
    }
    
    public void get_expected_result() {
        try{
            List<Integer> list = get_array();
            int min_idx = Dia_27.minimun_index(list);
            System.out.println(min_idx);
        }catch(Excepcion ex){
            System.out.println("Cannot get the minimum value index from an empty sequence");
        }
    }

}