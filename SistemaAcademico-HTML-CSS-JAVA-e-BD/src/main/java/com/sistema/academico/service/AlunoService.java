package com.sistema.academico.service;

import com.sistema.academico.model.Aluno;
import com.sistema.academico.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Inserir aluno (create)
    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    // Buscar alunos (read)
    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    // Buscar por ID (read)
    public Optional<Aluno> buscarAlunoporID(Long Id){
        return alunoRepository.findById(Id);
    }

    // Atualizar aluno (update)
    public Aluno atualizarAluno(Long Id, Aluno alunoAtualizar){
        return alunoRepository.findById(Id)
                .map(aluno -> {
                    aluno.setNomeAluno(alunoAtualizar.getNomeAluno());
                    aluno.setIdadeAluno(alunoAtualizar.getIdadeAluno());
                    aluno.setMatriculaAluno(alunoAtualizar.getMatriculaAluno());
                    return alunoRepository.save(aluno);
                })
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o ID: "+Id));
    }

    // Metodo para deletar (delete)
    public void deletarAluno(Long Id){
        alunoRepository.deleteById(Id);
    }
}
