package com.djg.emprestarlivros;

public class Usuario {
	private Long codigo;
	private String nomeCompleto;
	private String dataNascimento;
	private String endereço;
	
	public Usuario(String nomeCompletoParametro, String endereço) {
		this.nomeCompleto = nomeCompletoParametro;
		this.endereço = endereço;
		
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void imprimeUsuario() {
		System.out.println ("Nome:"+nomeCompleto);
		System.out.println ("Data de Nascimento:"+dataNascimento);
		System.out.println ("Endereço:"+endereço);
		
	}

}
