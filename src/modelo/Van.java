package modelo;

public class Van extends Veiculo implements Manutenivel {

    private double custoMensalManutencao;

    public Van(String placa, String modelo, double diariaBase,
               double custoMensalManutencao) {

        super(placa, modelo, diariaBase);

        if (custoMensalManutencao < 0) {
            throw new IllegalArgumentException(
                "O custo mensal de manutenção não pode ser negativo."
            );
        }

        this.custoMensalManutencao = custoMensalManutencao;
    }

    @Override
    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException(
                "A quantidade de dias deve ser maior que zero."
            );
        }

        return consultarDiariaBase() * dias * 1.20;
    }

    @Override
    public double custoMensalDeManutencao() {
        return custoMensalManutencao;
    }
}
