package br.org.serratec.model;

public class Pessoa {

	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	//ctrl+espaco construtor
	//Construtor default (padrão) vazio
	//Um construtor não tem retorne pode ter argumentos
	//Um construtor não é um método
	
	public Pessoa() {
		System.out.println("Objeto Criado!");
	}
	
	

	public Pessoa(Integer codigo, String nome, Double peso, Double altura) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}



	// alt+shift+s generate getters e setters

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	// Loombok

	private Double calcularIMC() {
		Double imc = peso / (altura * altura);
		return imc;
	}

	public String resultadoIMC() {

		if (calcularIMC() < 18.5) {
			return "Abaixo do Peso";
		} else if (calcularIMC() < 24.9) {
			return "Peso Ideal";
		} else {
			return "Acima do Peso";
		}
	}

}