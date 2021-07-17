public class Atendente extends Funcionarios{

    @Override
    public double calcularImposto(){
        return this.getSalario() * 0.01;
    }
}
