package com.ProjetoTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTarefas.entities.ItemExecucao;

public interface ItemExecucaoRepository extends JpaRepository<ItemExecucao, Long> {
	
}