package emprestimo;

import java.util.List;

public class EmprestimoController {

    private final EmprestimoDAO emprestimoDAO;

    public EmprestimoController(EmprestimoDAO emprestimoDAO) {
        this.emprestimoDAO = emprestimoDAO;
    }

    public List<Emprestimo> listarTodos(){
        return emprestimoDAO.listarTodos();
    }

    public void salvar(Emprestimo entity){
        emprestimoDAO.salvar(entity);
    }

    public void deletar(Emprestimo entity){
        emprestimoDAO.deletar(entity);
    }
}
