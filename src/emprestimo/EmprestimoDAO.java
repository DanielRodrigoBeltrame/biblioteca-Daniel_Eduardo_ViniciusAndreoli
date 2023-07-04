package emprestimo;

import interfaces.Crud;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class EmprestimoDAO implements Crud<Emprestimo> {

    private final List<Emprestimo> emprestimos;

    public EmprestimoDAO() {
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public List<Emprestimo> listarTodos() {
        return this.emprestimos;
    }

    @Override
    public void salvar(Emprestimo entity) {
        Emprestimo emprestimo = emprestimos.stream()
                .filter(umEmprestimo -> umEmprestimo.getId() == entity.getId())
                .findFirst().orElseThrow(() -> new NoSuchElementException("Emprestimo não encontrado"));
        this.emprestimos.add(emprestimo);
    }

    @Override
    public void deletar(Emprestimo entity) {
        this.emprestimos.remove(entity);
    }
}
