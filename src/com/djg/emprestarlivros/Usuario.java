package com.djg.emprestarlivros;

public class Usuario {
	private Long codigo;
	private String nomeCompleto;
	private String dataNascimento;
	private String endere�o;
	
	public Usuario(String nomeCompletoParametro, String endere�o) {
		this.nomeCompleto = nomeCompletoParametro;
		this.endere�o = endere�o;
		
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public void imprimeUsuario() {
		System.out.println ("Nome:"+nomeCompleto);
		System.out.println ("Data de Nascimento:"+dataNascimento);
		System.out.println ("Endere�o:"+endere�o);
		
	}

}
