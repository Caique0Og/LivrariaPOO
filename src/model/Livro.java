package model;

public class Livro extends Produto {
//atribustos
	private String autor;
	private String editor;
	private String edicao;
	
	//Construtores:
	public Livro(String descrico, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,
			String autor, String editor, String edicao) {
		super(descrico, genero, estoqueDisponivel, precoCusto, precoVenda);
		this.autor = autor;
		this.editor = editor;
		this.edicao = edicao;
	}

	public Livro() {
		this("", "", 0, 0, 0, "", "", "");
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
//specific methods
	public String listandoProduto() {
		return super.listandoProduto()+
				"\nAutor: " + autor +
				"nEditore: " + editor +
				"\nEdição: " + edicao;
	}
	
}
