package w3schools.inicio;

public class lampada {
    // caracteristicas de uma lampada
    String tipo; // qual tipo de lambada é led, eletronica, incandescente
    int potencia; // quantos watts essa lambada tem
    int durabilidade; // quanto tempo de vida útil essa lampada tem
    double economia; //quanto essa lampada economiza de energia
    String cor; //qual a cor da lampada, amarela, branca, vermelha
    int irc; // qual é a capacidade de reprodrução de cores da lampada numa escala de 0 a 100
    double preco; //qual é o valor dessa lampada
    String marca; // de qual é a marca da lampada
    int tensao; //qual a tensao da lampada
    boolean estado = false; // para ligar uma lampada
    public static void main(String[] args) {
        lampada lamp = new lampada();

        lamp.potencia = 80;
        lamp.cor = "branca";
        lamp.tipo = "led";

        lampada lamp2 = new lampada();

        lamp2.potencia = 60;
        lamp2.cor = "vermelha";
        lamp2.tipo = "led";
        
    }
    public void ligar(){
        if(!estado){
            System.out.println("liguei!");
            estado = true;
        } else{
            System.out.println("já estou ligada");
        }
    }
    public void desligar(){
        if(!estado){
            System.out.println("desliguei");  
            estado = false;
        } else{
            System.out.println("já estou ligada");
        }
    }
}
