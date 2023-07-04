package interfaces;

import java.util.List;
import java.util.Optional;

public interface Crud<T> {
    List<T> listarTodos();
    void salvar(T entity);
    void deletar(T entity);
}