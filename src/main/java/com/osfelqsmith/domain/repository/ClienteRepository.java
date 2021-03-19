package com.osfelqsmith.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osfelqsmith.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

		List<Cliente> findByNome(String nome);
		Cliente findByEmail(String email);
		
		/*
		 * SÓ PRECISA DISSO, O JPA VAI SABER PELO findBy 
		 * QUE É PRA FAZER UM MÉTODO DE PESQUISA COM ALGUM ATRIBUTO
		
		List<Cliente> findByNomeContaining(String nome);
		TAMBEM FUNCIONA
		*/
		
}
