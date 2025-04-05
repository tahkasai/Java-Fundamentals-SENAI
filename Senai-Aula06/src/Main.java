import Models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Onix";
        carro.cor = "preto";
        carro.ano = 2024;
        carro.exibirInformacao();
        
    }
}
