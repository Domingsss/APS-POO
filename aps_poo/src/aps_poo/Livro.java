package aps_poo;

public class Livro {
	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public boolean getDisponibilidade() {
		return disponivel;
	}
	
	public void Emprestar() {
		if (disponivel) {
			disponivel = false;
		}else {
			System.out.println("O livro já está emprestado!");
		}
	}
	
	public void retornoLivro() {
		disponivel = true;
	}
	
}
