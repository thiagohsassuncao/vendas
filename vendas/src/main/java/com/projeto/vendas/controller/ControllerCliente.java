package com.projeto.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.vendas.entidade.Cliente;
import com.projeto.vendas.service.ServiceCliente;

@RestController
@RequestMapping("/vendas")
public class ControllerCliente {
	
	@Autowired
	private ServiceCliente serviceCliente;
	
	@PostMapping
	public ResponseEntity Salvar (@RequestBody Cliente cliente) {
		try {
			Cliente cpfEncontrado = serviceCliente.buscaPorCPF(cliente.getCnpj());
			if (cpfEncontrado!=null) {
				return ResponseEntity.badRequest().body("CNPJ já consta cadastrado na base");
			}
			Cliente clienteSalvo = serviceCliente.salvar(cliente); 
			return ResponseEntity.ok(clienteSalvo);	
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	
}
