public class Carro extends Veiculo implements Manutenivel {

    private double custoMensalManutencao;

    public Carro(String placa, String modelo, double diariaBase,
                 boolean disponivel, boolean emManutencao,
                 double custoMensalManutencao) {

        super(placa, modelo, diariaBase, disponivel, emManutencao);

        this.custoMensalManutencao = custoMensalManutencao;
    }

    @Override
    public double calcularAluguel(int dias) {
        return getDiariaBase() * dias;
    }

    @Override
    public double custoMensalDeManutencao() {
        return custoMensalManutencao;
    }
}