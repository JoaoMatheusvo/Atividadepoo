package funcionarios;

public class Gerente extends Funcionario {
    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase * 0.05; // Bonificação de 5%
    }
}
