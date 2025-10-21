package abstracao;

public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int ano;

    public Carro(String marca, String modelo, String cor, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    public abstract void ligar();
    public abstract void acelerar();
    public abstract void frear();
    public abstract void desligar();

    public void exibirModelo() {
        System.out.println("\n--- Ações do Carro: " + modelo + " ---");
    }
}
