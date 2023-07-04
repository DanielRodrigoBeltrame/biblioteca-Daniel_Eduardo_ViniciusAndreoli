package estante;

import cliente.Cliente;
import livro.Livro;

import java.util.List;

public class EstanteController {

    private final EstanteDAO estanteDAO;

    public EstanteController(EstanteDAO estanteDAO) {
        this.estanteDAO = estanteDAO;
    }

    public List<Estante> listarTodos(){
       return estanteDAO.listarTodos();
    }

    public void salvar (Estante entity){
        estanteDAO.salvar(entity);
    }

    public void deletar (Estante entity){
        estanteDAO.deletar(entity);
    }

    public void addLivro(Livro livro, Estante estante) {
        estante.getLivros().add(livro);
    }

    public void removeLivro(Livro livro, Estante estante) {
        estante.getLivros().remove(livro);
    }
}
