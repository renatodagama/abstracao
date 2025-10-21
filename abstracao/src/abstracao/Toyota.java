package abstracao;

// BMW.java
public class Toyota extends Carro {
    
    public Toyota (String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
    }
    
    @Override
    public void ligar() {
        System.out.println("O motor do Corola liga. Potência total!");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O Corola é empurrado  pelo seu motor eficiente e silencioso. ");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios de alto desempenho do Corola garantem uma parada suave.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Deligando!");
    }
    
    
}