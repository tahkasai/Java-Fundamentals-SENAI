package com.sistema.academico.model;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;
    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    // Getter ----------------------------------------

    public long getIdAluno() {
        return idAluno;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public int getIdadeAluno() {
        return idadeAluno;
    }
    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    // Setter ----------------------------------------

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
}

