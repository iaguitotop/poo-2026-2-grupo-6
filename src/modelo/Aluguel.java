package modelo;

public class Aluguel {
    private static int contadorCodigo = 1;
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;
    private boolean encerrado;
    private int diasAtraso;
    private double valorPago;

    public Aluguel(Cliente cliente, Veiculo veiculo, int dias, double valorInicial) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        if (dias <= 0) {
            throw new IllegalArgumentException("O número de dias deve ser positivo.");
        }
        if (valorInicial < 0) {
            throw new IllegalArgumentException("O valor inicial não pode ser negativo.");
        }

        this.codigo = contadorCodigo++;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
        this.encerrado = false;
        this.diasAtraso = 0;
        this.valorPago = valorInicial;

    }

    //função adicionar dias
    public void adicionarDias(int diasExtras, double valorAdicional) {
        if (encerrado) {
            throw new IllegalStateException("O aluguel já foi encerrado.");
        }
        if (diasExtras <= 0) {
            throw new IllegalArgumentException("O número de dias extras deve ser positivo.");
        }
        if (valorAdicional < 0) {
            throw new IllegalArgumentException("O valor adicional não pode ser negativo.");
        }


        this.dias += diasExtras;
        this.valorPago += valorAdicional;
    }

    //função pra quando acabar o aluguel
    public void encerrar(int diasAtraso, double valorMulta) {
        if (encerrado) {
            throw new IllegalStateException("O aluguel já foi encerrado.");
        }
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("O número de dias de atraso não pode ser negativo.");
        }
        if (valorMulta < 0) {
            throw new IllegalArgumentException("O valor da multa não pode ser negativo.");
        }
        this.encerrado = true;
        this.diasAtraso = diasAtraso;
        this.valorPago += valorMulta;
    }

    public int getCodigo() {
        return codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public int getDias() {
        return dias;
    }
    public boolean isEncerrado() {
        return encerrado;
    }
    public int getDiasAtraso() {
        return diasAtraso;
    }
    public double getValorPago() {
        return valorPago;
    }

    @Override
    public String toString() {
        String status = encerrado ? "Encerrado (Atraso: " + diasAtraso + "d)" : "Em andamento";
        return String.format("Aluguel #%d | Cliente: %s | Veículo: %s (%s) | Dias: %d | Pago: R$ %.2f | Status: %s",
                codigo, cliente.getNome(), veiculo.consultarModelo(), veiculo.consultarPlaca(), dias, valorPago, status);
    }
}
