import abstracao.BMW;
import abstracao.Fiat;  
import abstracao.Toyota;  

public class App {
    public static void main(String[] args) {
        
        // 1. Instanciando um objeto de cada marca
        Toyota toyota = new Toyota("Toyota", "Corolla", "Prata", 2020);
        BMW bmw = new BMW("BMW", "M3", "Preto", 2021);
        Fiat fiat = new Fiat("Fiat", "500", "Vermelho", 2019);
        
        
        // ----------------------------------------------------------------
        // 2. Demonstração dos Métodos
        // ----------------------------------------------------------------
        
        // Ações do Toyota
        toyota.exibirModelo();
        toyota.ligar();
        toyota.acelerar();
        toyota.frear();
        toyota.desligar();
        
        
        // Ações do BMW
        bmw.exibirModelo();
        bmw.ligar();
        bmw.acelerar();
        bmw.frear();
        bmw.desligar();
        
        
        // Ações do Fiat
        fiat.exibirModelo();
        fiat.ligar();
        fiat.acelerar();
        fiat.frear();
        fiat.desligar();

    
    }
}