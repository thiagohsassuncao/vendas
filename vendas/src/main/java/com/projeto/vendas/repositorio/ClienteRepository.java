package com.projeto.vendas.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.vendas.entidade.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findBycnpj (String cnpj);

}
