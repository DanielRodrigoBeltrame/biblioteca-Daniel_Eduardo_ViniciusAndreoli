package estante;

import enums.Categoria;
import funcionario.Funcionario;
import interfaces.Crud;
import livro.Livro;

import java.util.List;

public class Estante {

    private int id;
    private List<Livro> livros;
    private int quantidadeDisponivel;
    private Funcionario funcionarioAlteracao;
    private Categoria categoria;

    public Estante(int id, int quantidadeDisponivel, Funcionario funcionarioAlteracao, Categoria categoria) {
        this.id = id;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.funcionarioAlteracao = funcionarioAlteracao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Funcionario getFuncionarioAlteracao() {
        return funcionarioAlteracao;
    }

    public void setFuncionarioAlteracao(Funcionario funcionarioAlteracao) {
        this.funcionarioAlteracao = funcionarioAlteracao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Estante{" +
                "id=" + id +
                ", livros=" + livros +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", funcionarioAlteracao=" + funcionarioAlteracao +
                ", categoria=" + categoria +
                '}';
    }
}
