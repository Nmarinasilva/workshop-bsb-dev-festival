package com.djg.emprestarlivros;

public class Livro {
	
	private Long codigo;
	private String titulo;
	private String autor;
	
	public Livro(String titulo, String autor){
	     this.titulo = titulo; 
	     this.autor = autor;		 
	}
	
	public void imprimeLivro() {
		
		System.out.println ("Titulo: "+titulo);
		System.out.println ("Autor: "+autor);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
