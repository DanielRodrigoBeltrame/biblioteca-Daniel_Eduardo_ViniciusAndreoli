package livro;

import enums.Categoria;
import interfaces.Crud;

import java.util.List;

public class Livro {

    private int id;
    private String autor;
    private String titulo;
    private Categoria categoria;
    private boolean status;
    private int quantidadeTotal;

    public Livro(int id, String autor, String titulo, Categoria categoria, boolean status, int quantidadeTotal) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.status = status;
        this.quantidadeTotal = quantidadeTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", categoria=" + categoria +
                ", status=" + status +
                ", quantidadeTotal=" + quantidadeTotal +
                '}';
    }
}
