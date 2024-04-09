package aula04;

public class index5 {
    public static void main(String[] args) {
        
        //converter fahrenheit em celcius;
        double celcius;
        int fahrenheit = 0;
        while(fahrenheit <= 100){
            celcius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + "°f é igual a " + (Math.round(celcius * 100.0) / 100.0) +"°c");
            fahrenheit = fahrenheit + 10;
           
        }
    }
}
