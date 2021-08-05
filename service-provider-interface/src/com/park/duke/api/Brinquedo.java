package com.park.duke.api;

public class Brinquedo {

	private String nome;

	private Integer capacidadePessoas;

	private Double alturaMinima;

	private Double valorPorPessoa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(Integer capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public Double getAlturaMinima() {
		return alturaMinima;
	}

	public void setAlturaMinima(Double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}

	public Double getValorPorPessoa() {
		return valorPorPessoa;
	}

	public void setValorPorPessoa(Double valorPorPessoa) {
		this.valorPorPessoa = valorPorPessoa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brinquedo [nome=");
		builder.append(nome);
		builder.append(", capacidadePessoas=");
		builder.append(capacidadePessoas);
		builder.append(", alturaMinima=");
		builder.append(alturaMinima);
		builder.append(", valorPorPessoa=");
		builder.append(valorPorPessoa);
		builder.append("]");
		return builder.toString();
	}

}