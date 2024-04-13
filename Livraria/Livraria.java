package Livraria;

import java.util.ArrayList;

public class Livraria {
    
    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();
    }
    
    public void cadastrarlivro(Livro livro){
        this.livros.add(livro);
    
    }

    public String listarLivros(){
       String listarLivros = "";
    
    for (Livro l  : this.livros) {
        listarLivros += l.id + " - " + l.titulo + "\n";
    }
    
       return listarLivros;

    }
    public String detalharLivroPorId(int id){
        String detalheLivro = "Livro não encontrado.\n";
        
        for(Livro livro : livros) {
          if  (livro.id == id){
              detalheLivro = livro.toString();

          }
        }
    
        return detalheLivro;
    }
}
