package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Livro {
	int id;
	String issn;
	String titulo;
	String sinopse;
	int ano;
	int n_pgs; //numero de paginas
}
