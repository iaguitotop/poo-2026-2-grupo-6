package modelo;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo, double diariaBase) {
        super(placa, modelo, diariaBase);
    }

    @Override
    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("O número de dias deve ser maior que 0.");
        }

        return consultarDiariaBase() * dias;
    }
}
