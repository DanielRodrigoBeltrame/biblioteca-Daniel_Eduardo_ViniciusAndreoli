package livro;

import java.util.List;

public class LivroController {

    private final LivroDAO livroDAO;

    public LivroController(LivroDAO livroDAO) {
        this.livroDAO = livroDAO;
    }

    public List<Livro> listarTodos(){
       return livroDAO.listarTodos();
    }

    public void salvar(Livro entity){
        livroDAO.salvar(entity);
    }

    public void deletar(Livro entity){
        livroDAO.deletar(entity);
    }
}
