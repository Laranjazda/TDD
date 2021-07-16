package testeUnidadde;

public class ItemCarrinho extends CarrinhoDeCompras {
    private Produto produto ;
    private double valorUnit;
    private double valor;
    private int quantidade;

    public ItemCarrinho(Produto produto, double valorUnit, int quantidade) {
        this.produto = produto;
        this.valorUnit = valorUnit;
        this.valor = valorUnit*quantidade;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valorUnit*quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal(){
        double quantidade = getValorUnit () * getQuantidade ();
        return quantidade;
    }

    @Override
    public String toString() {
        return "Carrinho{\n"
                + produto +
                ",\n    valorUnit=" + valorUnit +
                ",\n    valor=" + valor +
                ",\n    quantidade=" + quantidade +
                "\n}";
    }


}
