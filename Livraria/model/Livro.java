package model;


import java.util.Set;

public abstract class Livro {
    String titulo;
    String isbn;
    int numPags;
    int anoPub;
    String status;
    String resumo;
    double preco;
    Set<Autor> colecAutor;
    Set<Categoria> colecCategorias;

    public Set<Autor> getColecAutor() {
        return colecAutor;
    }

    public void setColecAutor(Set<Autor> colecAutor) {
        this.colecAutor = colecAutor;
    }

    public Set<Categoria> getColecCategorias() {
        return colecCategorias;
    }

    public void setColecCategorias(Set<Categoria> colecCategorias) {
        this.colecCategorias = colecCategorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    abstract double calcularPreco();
}
