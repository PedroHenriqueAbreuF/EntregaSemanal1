package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Autor {
	
	int id;
	String nome;
	String cpf;
	int idade;
}
