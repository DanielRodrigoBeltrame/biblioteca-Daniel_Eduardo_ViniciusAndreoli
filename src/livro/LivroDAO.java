package livro;

import interfaces.Crud;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LivroDAO implements Crud<Livro> {

    private final List<Livro> livros;

    public LivroDAO() {
        this.livros = new ArrayList<>();
    }

    @Override
    public List<Livro> listarTodos() {
        return this.livros;
    }

    @Override
    public void salvar(Livro entity) {
        this.livros.add(entity);
    }

    @Override
    public void deletar(Livro entity) {
        Livro livro = livros.stream()
                .filter(umLivro -> umLivro.getId() == entity.getId())
                .findFirst().orElseThrow(() -> new NoSuchElementException("Livro não encontrado"));
        this.livros.remove(livro);
    }
}
