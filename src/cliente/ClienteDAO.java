package cliente;

import interfaces.Crud;

import java.util.List;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ClienteDAO implements Crud<Cliente> {


    private final List<Cliente> clientes;

    public ClienteDAO() {this.clientes = new ArrayList<>();}

    @Override
    public List<Cliente> listarTodos() {
        return this.clientes;
    }

    @Override
    public void salvar(Cliente entity) {
        this.clientes.add(entity);
    }

    @Override
    public void deletar(Cliente entity) {
        Cliente cliente = clientes.stream()
                .filter(umCliente -> umCliente.getId() == entity.getId())
                .findFirst().orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));
        this.clientes.remove(cliente);
    }
}
