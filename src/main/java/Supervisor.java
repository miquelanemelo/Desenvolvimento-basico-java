public class Supervisor extends Funcionarios{

    @Override
    public double calcularImposto(){
        return this.getSalario() * 0.05;
    }
}
