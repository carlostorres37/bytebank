package com.alura.bytebank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.bytebank.model.Conta;
import com.alura.bytebank.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	public List<Conta> buscaConta() {
		return contaRepository.findAll();
	}
	
	public void deposita() {
		
	}
	
	public void saca() {
		
	}
	
	public void tranfere() {
		
	}
	
	public void mostraSaldo() {
		
	}

}
