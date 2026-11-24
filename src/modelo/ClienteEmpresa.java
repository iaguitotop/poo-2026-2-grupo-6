package modelo;

public class ClienteEmpresa extends Cliente {

    public ClienteEmpresa(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public double percentualDeDesconto() {
        return 0.0;
    }
}
