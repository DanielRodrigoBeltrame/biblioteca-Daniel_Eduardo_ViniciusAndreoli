package emprestimo;

import cliente.Cliente;
import enums.Situacao;
import interfaces.Crud;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo{

    private int id;
    private Cliente cliente;
    private LocalDate dataEmprestimo;
    private LocalDate previsaoDevolucao;
    private Situacao situacao;

    public Emprestimo(int id, Cliente cliente, LocalDate dataEmprestimo, LocalDate previsaoDevolucao, Situacao situacao) {
        this.id = id;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
        this.previsaoDevolucao = previsaoDevolucao;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getPrevisaoDevolucao() {
        return previsaoDevolucao;
    }

    public void setPrevisaoDevolucao(LocalDate previsaoDevolucao) {
        this.previsaoDevolucao = previsaoDevolucao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", dataEmprestimo=" + dataEmprestimo +
                ", previsaoDevolucao=" + previsaoDevolucao +
                ", situacao=" + situacao +
                '}';
    }
}
