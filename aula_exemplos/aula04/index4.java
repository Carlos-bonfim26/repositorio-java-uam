package aula04;

public class index4 {
    public static void main(String[] args) {
        
        //converter celcius em fahrenheit;
        int celcius = 0;
        int fahrenheit;
        while(celcius <= 100){
            fahrenheit = celcius * 9 / 5 + 32;
            System.out.println(celcius + "°c é igual a " + fahrenheit +"°f");
            celcius = celcius + 10;
           
        }
    }
}
