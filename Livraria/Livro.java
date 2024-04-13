package Livraria;

public class Livro {
    public int id;
    public String titulo;
    public String nomeAutor;
    public String anoPublicaco;
    public String editora;

    public Livro(int id, String titulo, String nomeAutor, String anoPublicacao, String editora){
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.anoPublicaco = anoPublicacao;
        this.editora = editora;

    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAnoPublicaco() {
        return this.anoPublicaco;
    }

    public void setAnoPublicaco(String anoPublicaco) {
        this.anoPublicaco = anoPublicaco;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", nomeAutor='" + getNomeAutor() + "'" +
            ", anoPublicaco='" + getAnoPublicaco() + "'" +
            ", editora='" + getEditora() + "'" +
            "}";
    }
    
    }


