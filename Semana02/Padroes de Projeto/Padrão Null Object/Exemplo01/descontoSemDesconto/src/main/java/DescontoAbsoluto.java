public class DescontoAbsoluto implements Desconto {

    private double valorDesconto;

    public DescontoAbsoluto(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }

    public double darDesconto(double valorOriginal){
        return valorOriginal - valorDesconto;
    }
}
