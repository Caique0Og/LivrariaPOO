package model;

public class Dvd extends Produto{
	private String diretor;
	private String duracao;
	private String censura;

}

public Dvd(String descrico, String genero, int estoqueDisponivel, double precoCusto, double precoVenda, String diretor,
		String duracao, String censura) {
	super(descrico, genero, estoqueDisponivel, precoCusto, precoVenda);
	this.diretor = diretor;
	this.duracao = duracao;
	this.censura = censura;
}

}
public Dvd () {
	this("", "", 0, 0, 0, "", "", "");
}
public String getDiretor() {
	return diretor;
}
public void setDiretor(String diretor) {
	this.diretor = diretor;
}
public String getDuracao() {
	return duracao;
}
public void setDuracao(String duracao) {
	this.duracao = duracao;
}
public String getCensura() {
	return censura;
}
public void setCensura(String censura) {
	this.censura = censura;
}

//specific methods
public String listandoProduto() {
	return super.listandoProduto()+
			"\ndiretor: " + diretor +
			"\nduracao: " + duracao +
			"\ncensura: : " + censura;
}

public void calcularPrecoVenda() {
	setPrecoVenda(getPrecoCusto()*1.15);
}



}
