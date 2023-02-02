
package com.mycompany.hackerran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;


public class Dia_12 {
    
    private String firstName;
    private String lastName;
    private int idNumber;
    private List<Integer> scores;
    
     public Dia_12(String firstName, String lastName, int idNumber, List<Integer> scores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber =idNumber;
        this.scores=scores;
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
    
    public int average(){
        int avg = 0;
        for(int grade: this.scores){
            avg+= grade;
        }      
        return avg/this.scores.size();
    }
    
    public char calculate(){
        int avg = average();
        int ch = ' ';
        if(avg < 40){    
            ch = 'T';
        }else if(avg<55){
            ch='D';
        }else if(avg<70){
            ch='P';
        }else if(avg<80){
            ch='A';
        }else if(avg <90){
            ch='E';
        }else if(avg<=100){
            ch='O';
        }
        return (char) ch;
    }
    
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> atr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());
        int n = Integer.parseInt(bufferedReader.readLine().trim());      
        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());
        bufferedReader.close();
        Dia_12 xd = new Dia_12(atr.get(0),atr.get(1),Integer.parseInt(atr.get(2)),scores);
        System.out.println("Name: " + xd.getLastName() +", "+ xd.getFirstName());
        System.out.println("ID: "+ xd.getIdNumber());
        System.out.println("Grade: "+xd.calculate());
    }
    
}
