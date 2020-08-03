package com.alura.bytebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.bytebank.model.Conta;
import com.alura.bytebank.service.ContaService;

@RestController
@RequestMapping("conta")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping
	public ResponseEntity<List<Conta>> buscaConta() {
		List<Conta> contas = contaService.buscaConta();
		return ResponseEntity.status(HttpStatus.OK).body(contas);
	}

}
