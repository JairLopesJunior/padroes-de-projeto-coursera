public class DescontoPercentual implements Desconto{

    private double percentual;

    public DescontoPercentual(double percentual){
        this.percentual = percentual;
    }

    public double darDesconto(double valorOriginal){
        return (100.0 - percentual) / 100 * valorOriginal;
    }
}
