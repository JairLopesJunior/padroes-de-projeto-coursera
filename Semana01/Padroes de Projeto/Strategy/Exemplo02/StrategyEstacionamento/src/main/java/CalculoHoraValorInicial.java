public class CalculoHoraValorInicial implements Calculo {

    private int valorInicial;
    private int limiteHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limiteHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    public int calcularTarifa(int qtdHoras) {
        int valor = this.valorInicial;
        if(qtdHoras > this.limiteHorasInicial) {
            valor += (qtdHoras - this.limiteHorasInicial) * valorHoraExcedente;
        }
        return valor;
    }
}
