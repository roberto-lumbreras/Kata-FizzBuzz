package org.factoriaf5;

public class App {
    public String fizzBuzz(int n){
        String s = "";
        if(n%3==0||String.valueOf(n).contains("3")){
            s+="Fizz";
        }
        if(n%5==0||String.valueOf(n).contains("5")){
            s+="Buzz";
        }
        if(s.equals("")){
            s = String.valueOf(n);
        }
        return s;
    }
}
