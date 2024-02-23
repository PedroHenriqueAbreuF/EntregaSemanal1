package app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import app.entity.Livro;

@Service
public class LivroService {
    List<Livro> lista = new ArrayList<>();
    
    public String save(Livro livro) {
        lista.add(livro);
        return livro.getTitulo() + " salvo com sucesso";
    }
    
    public String update(int id, Livro livro) {
        
        lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == id) {
                    lista.set(i, livro);
                    return livro.getTitulo()+ " alterado com sucesso";
                }
            }
        return "livro não encontrado para alterar";
    }

    public List<Livro> listAll(){
        
        Livro livro = new Livro(1, "AAA", "BBB", "CCC", 0, 0);
        Livro livro2 = new Livro(2, "AAA", "BBB", "CCC", 0, 0);
        Livro livro3 = new Livro(3, "AAA", "BBB", "CCC", 0, 0);
        
        lista.add(livro);
        lista.add(livro2);
        lista.add(livro3);
        
        return lista;
    }
    
    public Livro findById(long idLivro) {
        
        lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == idLivro) {
                    return lista.get(i);
                }
            }
        return null;
    }
    
    public String delete(long idLivro) {
        
        lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == idLivro) {
                    lista.remove(lista.get(i));
                    return "Deletado com Sucesso!";
                }
            }
        return "Não encontramos para deletar";
    }
}