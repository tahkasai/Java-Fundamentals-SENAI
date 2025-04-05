package Models;

public class Pessoa {
    // Variáveis
    protected String nomePessoa;
    protected int idadePessoa;

    //construtor
    public Pessoa(String nome, int idade) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
    }

    //getter
    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getIdade() {
        return idadePessoa;
    }

    //


}
