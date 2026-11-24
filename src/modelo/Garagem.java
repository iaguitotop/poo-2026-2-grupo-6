package modelo;

public class Garagem implements Manutenivel {
    private String nome;
    private double custoMensal;

    public Garagem(String nome, double custoMensal) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da garagem deve ser informado.");
        }
        if (custoMensal < 0) {
            throw new IllegalArgumentException("O custo mensal não pode ser negativo.");
        }

        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double custoMensalDeManutencao() {
        return custoMensal;
    }
}
