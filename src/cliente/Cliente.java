package cliente;

import enums.ClassificacaoCliente;
import interfaces.Crud;
import livro.Livro;
import pessoa.Pessoa;

import java.util.List;

public class Cliente  extends Pessoa{

    private String email;
    private List<Livro> livros;
    private ClassificacaoCliente situacao;

    public Cliente(int id, String nome, String telefone, String email, ClassificacaoCliente situacao) {
        super(id, nome, telefone);
        this.email = email;
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public ClassificacaoCliente getSituacao() {
        return situacao;
    }

    public void setSituacao(ClassificacaoCliente situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", livros=" + livros +
                ", situacao=" + situacao +
                "} " + super.toString();
    }
}
