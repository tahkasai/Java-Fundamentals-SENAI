package Models;

public class Carro extends Veiculo {
    public String modelo;
    public String cor;
    public int ano;


    public void exibirInformacao(){
        System.out.println("Informações técnicas");
        System.out.println("----------------------------");
        System.out.println("Modelo: "+ modelo+"\nCor: "+cor+"\nAno:"+ano);
    }

    @Override
    public void mover(){
        System.out.println("Carro em Movimento");
        System.out.println("Carro em alta velocidade");
    }
}
