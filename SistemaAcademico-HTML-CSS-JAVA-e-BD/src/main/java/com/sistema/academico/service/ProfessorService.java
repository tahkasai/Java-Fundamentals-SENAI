package com.sistema.academico.service;

import com.sistema.academico.model.Professor;
import com.sistema.academico.repository.ProfessorRepository;
import org.apache.juli.logging.Log;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public class ProfessorService {
    private ProfessorRepository professorRepository;

    // Inserir (Create)
    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    // Buscar todos (Read)
    public List<Professor> listarTodos(){
        return professorRepository.findAll();
    }

    // Buscar por Id (Read)
    public Optional<Professor> buscarPorId(Long Id){
        return professorRepository.findById(Id);
    }

    // Atualizar (Update)
    public Professor atualizarProfessor(Long Id, Professor professorAtualizado){
        return professorRepository.findById(Id)
                .map(professor ->{
                    professor.setNomeProfessor(professorAtualizado.getNomeProfessor());
                    professor.setDisciplina(professorAtualizado.getDisciplina());
                    return professorRepository.save(professor);
                })
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: "+Id));
    }

    // Deletar (Delete)
    public void deletarProfessor(Long Id){
        professorRepository.deleteById(Id);
    }
}
