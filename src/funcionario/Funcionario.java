package funcionario;

import endereco.Endereco;
import enums.Cargo;
import interfaces.Crud;
import pessoa.Pessoa;

import java.util.List;

public class Funcionario extends Pessoa {

    private String cpf;
    private Endereco endereco;
    private String codigoCtps;
    private Cargo cargo;

    public Funcionario(int id, String nome, String telefone, String cpf, Endereco endereco, String codigoCtps, Cargo cargo) {
        super(id, nome, telefone);
        this.cpf = cpf;
        this.endereco = endereco;
        this.codigoCtps = codigoCtps;
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCodigoCtps() {
        return codigoCtps;
    }

    public void setCodigoCtps(String codigoCtps) {
        this.codigoCtps = codigoCtps;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                ", codigoCtps='" + codigoCtps + '\'' +
                ", cargo=" + cargo +
                "} " + super.toString();
    }
}
