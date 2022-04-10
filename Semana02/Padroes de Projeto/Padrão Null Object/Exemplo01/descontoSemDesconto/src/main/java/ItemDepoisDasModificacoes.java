public class ItemDepoisDasModificacoes {

    private String nome;
    private double valor;
    private Desconto desconto = new SemDesconto();

    public ItemDepoisDasModificacoes(String nome, double valor, Desconto desconto){
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public ItemDepoisDasModificacoes(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String toString() {
        return nome + " R$" + desconto.darDesconto(valor);
    }

    public double precoQuantidade(int qtd){
        return desconto.darDesconto(valor) * qtd;
    }
}
