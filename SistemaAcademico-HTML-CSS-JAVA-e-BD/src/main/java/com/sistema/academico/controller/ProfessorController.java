package com.sistema.academico.controller;
import com.sistema.academico.model.Professor;
import com.sistema.academico.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    // Listar todos (Read)
    @GetMapping
    public String listarProfessor(Model model){
        List<Professor> Professores = professorService.listarTodos();
        model.addAttribute("professores",Professores);
        return "professores/listar";
    }

    // Formulário para novos professores (Create)
    @GetMapping("/novo")
    public String salvarProfessores(Model model){
        model.addAttribute("professor",new Professor());
        return "professores/form";
    }

    // Salvar novo professor (Create)
    @PostMapping("/salvar")
    public String salvarProfessor(@ModelAttribute Professor professor){
        professorService.salvarProfessor(professor);
        return "redirect:/professores";
    }

    // Formulário para editar professor (Update)
    @GetMapping("/editar/{id}")
    public  String editarProfessorForm(@PathVariable Long id, Model model){
        Professor professor = professorService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com ID: "+id));
        model.addAttribute("professor",professor);
        return "professores/form";
    }

    // Atualizar professor (Update)
    @PostMapping("/atualizar/{id}")
    public  String atualizarProfessor(@PathVariable Long id, @ModelAttribute Professor professor){
        professorService.atualizarProfessor(id,professor);
        return "redirect:/professores";
    }

    // Deletar professor (Delete)
    @GetMapping("/deletar/{id}")
    public String deletarProfessor(@PathVariable Long id){
        professorService.deletarProfessor(id);
        return "redirect:/professores";
    }

}
