public class CalculoHora implements Calculo {

    private int valorHora;

    public CalculoHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int calcularTarifa(int qtdHoras) {
        return this.valorHora * qtdHoras;
    }
}




















