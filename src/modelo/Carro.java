package modelo;

public class Carro extends Veiculo implements Manutenivel {

    private double custoMensalManutencao;

    public Carro(String placa, String modelo, double diariaBase,
                 double custoMensalManutencao) {

        super(
            validarPlaca(placa),
            validarModelo(modelo),
            validarDiariaBase(diariaBase)
        );

        if (custoMensalManutencao < 0) {
            throw new IllegalArgumentException(
                "O custo mensal de manutenção não pode ser negativo."
            );
        }

        this.custoMensalManutencao = custoMensalManutencao;
    }

    // 1ª verificação: placa
    private static String validarPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa é obrigatória.");
        }
        return placa;
    }

    // 2ª verificação: modelo
    private static String validarModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo é obrigatório.");
        }
        return modelo;
    }

    // 3ª verificação: diária-base
    private static double validarDiariaBase(double diariaBase) {
        if (diariaBase <= 0) {
            throw new IllegalArgumentException(
                "A diária base deve ser maior que zero."
            );
        }
        return diariaBase;
    }

    // 4ª verificação: dias de aluguel
    @Override
    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException(
                "A quantidade de dias deve ser maior que zero."
            );
        }

        return consultarDiariaBase() * dias;
    }

    // 5ª verificação: custo de manutenção
    @Override
    public double custoMensalDeManutencao() {
        return custoMensalManutencao;
    }
}