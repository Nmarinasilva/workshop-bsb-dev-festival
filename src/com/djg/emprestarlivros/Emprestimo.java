package com.djg.emprestarlivros;

import java.time.LocalDate;

public class Emprestimo {
	
	private Long codigo;
	private Usuario usuario;
	private Livro livro;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public Emprestimo(LocalDate dataEmprestimo, Livro livro,Usuario usuario) {
		this.dataEmprestimo = dataEmprestimo;
		this.usuario = usuario;
		this.livro = livro;
		setdataDevolucao();
		
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getdataDevolucao() {
		return dataDevolucao;
	}

	public void setdataDevolucao() {
		this.dataDevolucao = dataEmprestimo.plusDays(3);
	}
	
	public void imprimeEmprestimo() {
		
		System.out.println ("Livro: "+livro.getTitulo());
		System.out.println ("Codigo: "+codigo);
		System.out.println ("Usuario: "+usuario.getNomeCompleto());
		System.out.println ("Data de Emprestimo: "+dataEmprestimo);
		System.out.println ("Data de Devolução: "+dataDevolucao);
		System.out.println("O emprestimo esta vencido?" +emprestimoVencido());
		
	}
	
	public boolean emprestimoVencido() {
		if (LocalDate.now().isAfter(dataDevolucao)) {
			return false;
			
		}else {
			return true;
		}
	}
}
