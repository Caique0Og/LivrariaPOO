package model;

public class Produto {
//atributos
private String descrico;
private String genero;
private int estoqueDisponivel;
private double precoCusto;
private double precoVenda;
//construtores

public Produto(String descrico, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
	super();
	this.descrico = descrico;
	this.genero = genero;
	this.estoqueDisponivel = estoqueDisponivel;
	this.precoCusto = precoCusto;
	this.precoVenda = precoVenda;
}

public Produto() {
	this("", "",0,0,0);
}

//getter and setters

public String getDescrico() {
	return descrico;
}

public void setDescrico(String descrico) {
	this.descrico = descrico;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public int getEstoqueDisponivel() {
	return estoqueDisponivel;
}

public void setEstoqueDisponivel(int estoqueDisponivel) {
	this.estoqueDisponivel = estoqueDisponivel;
}

public double getPrecoCusto() {
	return precoCusto;
}

public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}

public double getPrecoVenda() {
	return precoVenda;
}

public void setPrecoVenda(double precoVenda) {
	this.precoVenda = precoVenda;
}

//specific methods

public void comprar(int qtde) {
	estoqueDisponivel += qtde;
}

public void vender(int qtde) {
	estoqueDisponivel -= qtde;
}

public void calcularPrecoVenda() {
	precoVenda = precoCusto * 1.1;
}

public String listandoProduto() {
	return "Descrição: " + descrico +
			"\nGênero :" + genero +
			"\nEstoque Disponivel: " + estoqueDisponivel +
			"\nPreço: de Custo: " + precoCusto +
			"\nPreço de Venda: " + precoVenda;
}



	
}
