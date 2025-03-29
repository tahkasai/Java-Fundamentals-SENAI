package models;
import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.alunos =  new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void listaDeAlunos(){
        System.out.println("Lista de Alunos da escola");
        System.out.println("------------------------------------------");
        for(Aluno aluno:alunos){
            System.out.println(aluno);
        }
    }

    public void listaDeProfessores(){
        System.out.println("Lista de Professores da escola");
        System.out.println("-----------------------------------------");
        for(Professor professor:professores){
            System.out.println(professor);
        }
    }


}
