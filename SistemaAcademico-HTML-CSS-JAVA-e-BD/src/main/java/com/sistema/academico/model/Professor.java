package com.sistema.academico.model;

import jakarta.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProfessor;
    private String nomeProfessor;
    private String disciplina;

    // Getter ----------------------------------------
    public long getIdProfessor() {
        return idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    // Setter ----------------------------------------
    public void setIdProfessor(long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
