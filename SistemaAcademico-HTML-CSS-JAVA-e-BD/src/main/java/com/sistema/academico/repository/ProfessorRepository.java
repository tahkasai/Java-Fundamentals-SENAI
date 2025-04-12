package com.sistema.academico.repository;

import com.sistema.academico.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {


}
