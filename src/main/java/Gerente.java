public class Gerente extends Funcionarios{

    @Override
    public double calcularImposto(){
        return this.getSalario() * 0.1 ;
    }
}
