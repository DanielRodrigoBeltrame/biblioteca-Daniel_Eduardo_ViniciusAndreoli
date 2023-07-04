package funcionario;

import interfaces.Crud;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FuncionarioDAO implements Crud<Funcionario> {

    private final List<Funcionario> funcionarios;

    public FuncionarioDAO() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public List<Funcionario> listarTodos() {
        return this.funcionarios;
    }

    @Override
    public void salvar(Funcionario entity) {
        this.funcionarios.add(entity);
    }

    @Override
    public void deletar(Funcionario entity) {
        Funcionario funcionario = funcionarios.stream()
                .filter(umLivro -> umLivro.getId() == entity.getId())
                .findFirst().orElseThrow(() -> new NoSuchElementException("Livro não encontrado"));
        this.funcionarios.remove(funcionario);
    }
}
