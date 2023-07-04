package funcionario;

import java.util.List;

public class FuncionarioController {

    private final FuncionarioDAO funcionarioDAO;

    public FuncionarioController(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public List<Funcionario> listarTodos (){
        return funcionarioDAO.listarTodos();
    }

    public void salvar (Funcionario entity){
        funcionarioDAO.salvar(entity);
    }

    public void deletar (Funcionario entity){
        funcionarioDAO.deletar(entity);
    }
}
