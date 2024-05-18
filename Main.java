package funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 50.0, 160);
        Lider lider = new Lider("Maria", 60.0, 160);
        Gerente gerente = new Gerente("Carlos", 70.0, 160);

        System.out.println("Salário do Funcionário " + funcionario.getNome() + ": " + funcionario.calcularSalario());
        System.out.println("Salário do Líder " + lider.getNome() + ": " + lider.calcularSalario());
        System.out.println("Salário do Gerente " + gerente.getNome() + ": " + gerente.calcularSalario());
    }
}
