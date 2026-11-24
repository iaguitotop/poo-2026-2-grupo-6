package modelo;

public class ClientePessoaFisica extends Cliente {

    public ClientePessoaFisica(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public double percentualDeDesconto() {
        return 0.0;
    }
}
