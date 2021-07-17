import java.util.ArrayList;
import java.util.List;

public class Carro {

    private String modelo;
    private int lugares;
    private String cor;
    private List<Pessoa> pessoas;

    public Carro() {
    }

    public Carro(String modelo, int lugares, String cor) {
        this.modelo = modelo;
        this.lugares = lugares;
        this.cor = cor;
        this.pessoas = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public int getLugares() {
        return lugares;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void adicionarPessoas(Pessoa pessoa) {
        final int size = this.pessoas.size();
        if (size < lugares  )
            this.pessoas.add(pessoa);
    }
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", lugares=" + lugares +
                ", cor='" + cor + '\'' +
                ", pessoas=" + pessoas +
                '}';
    }
}
