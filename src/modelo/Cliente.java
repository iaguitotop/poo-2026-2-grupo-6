package modelo;

public abstract class Cliente {
    private String nome;
    private String documento;
    private String telefone;


    //Cosntrutor da classe Cliente
    public Cliente(String nome, String documento, String telefone) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou vazio.");
        }
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("O documento do cliente não pode ser nulo ou vazio.");
        }
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone do cliente não pode ser nulo ou vazio.");
        }

        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    //método abstrato pra calcular o percentual de desconto
    public abstract double percentualDeDesconto();
    
    //getters 
    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefone() {
        return telefone;
    }


}
