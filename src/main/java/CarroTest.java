public class CarroTest {

    public static void main(String[] args) {

        Carro gol = new Carro("Gol", 5, "Branco" );
        Pessoa yure = new Pessoa("Yure");
        gol.adicionarPessoas(yure);
        gol.adicionarPessoas(yure);
        gol.adicionarPessoas(yure);
        gol.adicionarPessoas(yure);
        gol.adicionarPessoas(yure);
        gol.adicionarPessoas(yure);

        System.out.println(gol);
    }
}
