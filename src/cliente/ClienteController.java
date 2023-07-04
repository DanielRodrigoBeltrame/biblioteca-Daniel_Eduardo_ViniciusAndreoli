package cliente;
import livro.Livro;

import java.util.List;
public class ClienteController {

    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    public List<Cliente> listarTodos(){
        return clienteDAO.listarTodos();
    }
    public void salvar(Cliente entity) {clienteDAO.salvar(entity);}

    public void deletar(Cliente entity) {clienteDAO.deletar(entity);}

    public void addLivro(Livro livro, Cliente cliente) {
        cliente.getLivros().add(livro);
    }

    public void removeLivro(Livro livro, Cliente cliente) {
        cliente.getLivros().remove(livro);
    }
}
