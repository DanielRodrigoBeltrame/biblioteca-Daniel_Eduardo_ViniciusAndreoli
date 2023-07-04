package estante;

import interfaces.Crud;
import livro.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class EstanteDAO implements Crud<Estante> {

    private final List<Estante> estantes;

    public EstanteDAO() {
        this.estantes = new ArrayList<>();
    }

    @Override
    public List<Estante> listarTodos() {
        return this.estantes;
    }

    @Override
    public void salvar(Estante entity) {
        this.estantes.add(entity);
    }

    @Override
    public void deletar(Estante entity) {
        Estante estante = estantes.stream()
                .filter(umaEstante -> umaEstante.getId() == entity.getId())
                .findFirst().orElseThrow(() -> new NoSuchElementException("Estante não encontrado"));
        this.estantes.remove(estante);
    }
}
