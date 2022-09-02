package br.org.serratec.model;

public class AtletaProfissional extends Maratona {

	private Double peso;

	public AtletaProfissional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public Boolean getpodeCompetir() {
		return (altura > 1.80 || idade > 18) ? true : false;
	}
}
