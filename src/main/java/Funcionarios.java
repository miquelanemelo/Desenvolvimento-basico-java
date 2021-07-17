public abstract class Funcionarios {

    double salario;

    public abstract double calcularImposto();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double salarioLiquido(){
       double imposto =  this.calcularImposto();
       return salario - imposto;
    }

}
