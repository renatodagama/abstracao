package abstracao;

// BMW.java
public class Fiat extends Carro {
    
    public Fiat(String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
    }
    
    @Override
    public void ligar() {
        System.out.println("O motor BMW V6 ronca alto ao ligar. Potência total!");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O BMW é empurrado violentamente pelo seu motor turbo. VROOOM!");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios de alto desempenho do BMW garantem uma parada rápida.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Deligando!");
    }
    
    
}