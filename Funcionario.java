package funcionarios;

public class Funcionario {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
