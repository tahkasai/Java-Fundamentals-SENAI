package Carro.Models;

public class Fabricante extends ModeloAno{
    public Long Id;

    public String Modelo;
    public String cor;
    public int ano;

    @Override
    public void veiculoDoAno(){
        System.out.println("Carro de corrida ABCD");
    }
}
