package com.ProjetoTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
}