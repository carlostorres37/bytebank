package com.alura.bytebank.dto;

public class ClienteDTO {

	private String nome;
	private String cpfComStatus;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfComStatus() {
		return cpfComStatus;
	}
	public void setCpfComStatus(String cpfComStatus) {
		this.cpfComStatus = cpfComStatus;
	}
}
