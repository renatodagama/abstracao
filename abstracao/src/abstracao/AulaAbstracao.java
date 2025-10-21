package abstracao;

public abstract class AulaAbstracao {
    protected String nome;
    protected double salarioBase;
    
    public AulaAbstracao(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    // Método abstrato - deve ser implementado
    public abstract double calcularSalario();
    
    // Método concreto
    public void exibir() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário: R$ " + calcularSalario());
    }
}

