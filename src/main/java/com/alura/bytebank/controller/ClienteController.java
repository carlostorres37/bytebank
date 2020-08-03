package com.alura.bytebank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.bytebank.model.Cliente;
import com.alura.bytebank.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> buscaCliente() {
		return clienteService.buscaCliente();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> buscaClientePorId(@PathVariable("id") Long idCliente) {
		return clienteService.buscaClientePorId(idCliente);
	} // 404 NOT FOUND
	
	@PostMapping
	public void adicionaCliente(@RequestBody Cliente cliente) {
		clienteService.adicionaCliente(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> inativaCliente(@PathVariable("id") Long idCliente) {
		boolean inativaCliente = clienteService.inativaCliente(idCliente);
		if (inativaCliente) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> atualizaCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		boolean atualizaCliente = clienteService.atualizaCliente(id, cliente);
		if (atualizaCliente) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	

}
