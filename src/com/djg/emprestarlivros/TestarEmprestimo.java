package com.djg.emprestarlivros;

import java.time.LocalDate;

public class TestarEmprestimo {
	
	public static void main (String[]args){		
		Livro livro1 = new Livro("A Mão e a Luva","Machado de Assis");
		Usuario usuario1 = new Usuario("Neuza Marina da Silva", "Asa Sul");		
		
		Emprestimo emprestimo1 = new Emprestimo(LocalDate.of(2019, 9, 30), livro1, usuario1);
		
		emprestimo1.imprimeEmprestimo();
		
	}

}
