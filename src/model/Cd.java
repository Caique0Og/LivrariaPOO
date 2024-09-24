package model;

public class Cd extends Produto {

	
	private String Artista;
	private String Gravadora;
	private String paisOrigem;
	public Cd(String descrico, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,
			String artista, String gravadora, String paisOrigem) {
		super(descrico, genero, estoqueDisponivel, precoCusto, precoVenda);
		Artista = artista;
		Gravadora = gravadora;
		this.paisOrigem = paisOrigem;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	public String getGravadora() {
		return Gravadora;
	}
	public void setGravadora(String gravadora) {
		Gravadora = gravadora;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public String listandoProduto() {
		return super.listandoProduto()+
				"\nArtista: " + Artista +
				"\nGravadora: " + Gravadora +
				"\nPais de Origem: : " + paisOrigem;
	}
	
	public void calcularPrecoVenda() {
		setPrecoVenda(getPrecoCusto()*1.15);
	}
	
}
