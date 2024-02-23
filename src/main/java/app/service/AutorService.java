package app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import app.entity.Autor;

@Service
public class AutorService {
	List<Autor> lista = new ArrayList<>();
	
	public String save(Autor autor) {
		lista.add(autor);
		return autor.getNome() + " salvo com sucesso";
	}
	
	public String update(int id, Autor autor) {
		
		lista = this.listAll();
		
		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, autor);
					return autor.getNome()+ " alterado com sucesso";
				}
			}
		return "autor não encontrado para alterar";
	}

	public List<Autor> listAll(){
		
		Autor autor = new Autor(1, "AAA", "BBB", 0);
		Autor autor2 = new Autor(2, "AAA", "BBB", 0);
		Autor autor3 = new Autor(3, "AAA", "BBB", 0);
		
		lista.add(autor);
		lista.add(autor2);
		lista.add(autor3);
		
		return lista;
	}
	
	public Autor findById(long idAutor) {
		
		lista = this.listAll();
		
		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					return lista.get(i);
				}
			}
		return null;
	}
	
	public String delete(long idAutor) {
		
		lista = this.listAll();
		
		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					lista.remove(lista.get(i));
					return "Deletado com Sucesso!";
				}
			}
		return "Nao econtramos para deletear";
	}
}

