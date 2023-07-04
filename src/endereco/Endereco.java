package endereco;

public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String numero;
    private String bairro;
    private String rua;

    public Endereco(String pais, String estado, String cidade, String numero, String bairro, String rua) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
