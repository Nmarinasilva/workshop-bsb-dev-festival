package com.djg.emprestarlivros;

public class Usuario {
	private Long codigo;
	private String nomeCompleto;
	private String dataNascimento;
	private String enderešo;
	
	public Usuario(String nomeCompletoParametro, String enderešo) {
		this.nomeCompleto = nomeCompletoParametro;
		this.enderešo = enderešo;
		
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public void imprimeUsuario() {
		System.out.println ("Nome:"+nomeCompleto);
		System.out.println ("Data de Nascimento:"+dataNascimento);
		System.out.println ("Enderešo:"+enderešo);
		
	}

}
