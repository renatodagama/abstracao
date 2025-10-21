package abstracao;

// BMW.java
public class Fiat extends Carro {
    
    public Fiat(String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
    }
    
    @Override
    public void ligar() {
        System.out.println("O motor do Fiat 500 é acionado!");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O Fiat 500 acelera devagar ");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios do Fiat 500 garantem uma parada suave.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desligando!");
    }
    
    
}