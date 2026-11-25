package modelo;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double diariaBase;
    private boolean disponivel;
    private boolean emManutencao;

    public Veiculo(String placa, String modelo, double diariaBase) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Nome de placa vazio.");
        }

        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Nome de modelo vazio.");
        }

        if (diariaBase <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que 0;");
        }

        this.placa = placa;
        this.modelo = modelo;
        this.diariaBase = diariaBase;
        this.disponivel = true;
        this.emManutencao = false;

    }

        public abstract double calcularAluguel(int dias);

        public String consultarPlaca() {
            return placa;
        }

        public String consultarModelo() {
            return modelo;
        }

        public double consultarDiariaBase() {
            return diariaBase;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public boolean isEmManutencao() {
            return emManutencao;
        }

        public void alterarDiariaBase(double diariaBase) {
            if (diariaBase <= 0) {
                throw new IllegalArgumentException("O valor da diária deve ser maior que 0.");
            }

            this.diariaBase = diariaBase;
        }

        public void alterarDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }

        public void alterarEmManutencao(boolean emManutencao) {
            this.emManutencao = emManutencao;
        }
}
