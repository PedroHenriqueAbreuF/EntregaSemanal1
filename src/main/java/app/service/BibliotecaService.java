package app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import app.entity.Biblioteca;

@Service
public class BibliotecaService {
    List<Biblioteca> lista = new ArrayList<>();
    
    public String save(Biblioteca biblioteca) {
        lista.add(biblioteca);
        return biblioteca.getNome() + " salva com sucesso";
    }
    
    public String update(int id, Biblioteca biblioteca) {
        
        lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == id) {
                    lista.set(i, biblioteca);
                    return biblioteca.getNome()+ " alterada com sucesso";
                }
            }
        return "biblioteca não encontrada para alterar";
    }

    public List<Biblioteca> listAll(){
        
        Biblioteca biblioteca = new Biblioteca(1, "AAA", "BBB");
        Biblioteca biblioteca2 = new Biblioteca(2, "AAA", "BBB");
        Biblioteca biblioteca3 = new Biblioteca(3, "AAA", "BBB");
        
        lista.add(biblioteca);
        lista.add(biblioteca2);
        lista.add(biblioteca3);
        
        return lista;
    }
    
public Biblioteca findById(long idBiblioteca) {
        
        lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == idBiblioteca) {
                    return lista.get(i);
                }
            }
        return null;
    }
    
    public String delete(long idBiblioteca) {
    	
lista = this.listAll();
        
        if(lista != null)
            for(int i=0; i<lista.size(); i++) {
                if(lista.get(i).getId() == idBiblioteca) {
                    lista.remove(lista.get(i));
                    return "Deletado com Sucesso!";
                }
            }
        return "Não encontramos para deletar";
    }
    }
        
    
