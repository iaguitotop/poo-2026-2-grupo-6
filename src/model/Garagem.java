package model;

public class Garagem implements Manutenivel {
    private String nome;
    private double custoMensal;

    public Garagem(String nome, double custoMensal) {
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
