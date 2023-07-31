package com.projeto.vendas.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.vendas.entidade.Cliente;
import com.projeto.vendas.repositorio.ClienteRepository;

@Service
public class ServiceCliente {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);		
	}

	public Cliente buscaPorCPF(String cnpj) {
		return null;
	}
}
