package emprestimo;

import enums.Situacao;

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

    public void devolver(Emprestimo emprestimo) {
        emprestimo.setSituacao(Situacao.DEVOLVIDO);
    }
}
