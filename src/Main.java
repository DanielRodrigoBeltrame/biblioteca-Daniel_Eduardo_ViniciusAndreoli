import cliente.Cliente;
import cliente.ClienteController;
import cliente.ClienteDAO;
import emprestimo.Emprestimo;
import emprestimo.EmprestimoController;
import emprestimo.EmprestimoDAO;
import enums.Categoria;
import enums.ClassificacaoCliente;
import enums.Situacao;
import livro.Livro;
import livro.LivroController;
import livro.LivroDAO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LivroController livroController = new LivroController(new LivroDAO());

        Livro livro1 = new Livro(15, "rogerio", "fazer uma prova em 4 horas", Categoria.ACAO, true, 25);
        Livro livro2 = new Livro(16, "daniel", "fazer uma prova em 4 horas", Categoria.ACAO, true, 25);

        livroController.salvar(livro1);
        livroController.salvar(livro2);

        System.out.println(livroController.listarTodos());

        livroController.deletar(livro1);
        System.out.println("Após exclusão");
        System.out.println(livroController.listarTodos());

        ClienteController clienteController = new ClienteController(new ClienteDAO());

        Cliente cliente1 = new Cliente(14, "vinicius", "992556447", "vinici1310@gmail.com", ClassificacaoCliente.BOA);
        Cliente cliente2 = new Cliente(17, "jorge", "993778365", "jorge4567@gmail.com", ClassificacaoCliente.RUIM);

        clienteController.salvar(cliente1);
        clienteController.salvar(cliente2);

        System.out.println(clienteController.listarTodos());

        EmprestimoController emprestimoController = new EmprestimoController(new EmprestimoDAO());

        Emprestimo emprestimo1 = new Emprestimo(12, cliente1, LocalDate.of(2022, 10, 20), LocalDate.of(2022, 10, 30), Situacao.ATRASADO);
        Emprestimo emprestimo2 = new Emprestimo(13, cliente1, LocalDate.of(2022, 10, 20), LocalDate.of(2022, 10, 30), Situacao.EM_DIA);

        emprestimoController.salvar(emprestimo1);
        emprestimoController.salvar(emprestimo2);

        System.out.println(emprestimoController.listarTodos());
        emprestimoController.devolver(emprestimo1);
        System.out.println(emprestimo1);
    }
}