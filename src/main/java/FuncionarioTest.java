public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionarios gerente = new Gerente();
        gerente.setSalario(1000);
        Funcionarios supervisor = new Supervisor();
        supervisor.setSalario(1000);
        Funcionarios atendente = new Atendente();
        atendente.setSalario(1000);

        System.out.println(gerente.calcularImposto());
        System.out.println(gerente.salarioLiquido());
        System.out.println(atendente.calcularImposto());
    }
}
