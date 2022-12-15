package datas;

public class Aluno {
	private String nome;
	private int codigo;
	private double media;
	
	public Aluno(String nome, int codigo, double media) {
		this.nome = nome;
		this.codigo = codigo;
		this.media = media;
	}
	
	public Aluno(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public String toString() {
		return "Nome: " +
			    nome.toUpperCase().trim()    +
			    ", Código: " +
			    codigo       +
			    ", média: "  +
			    media;
			    
	}
	
	
}
