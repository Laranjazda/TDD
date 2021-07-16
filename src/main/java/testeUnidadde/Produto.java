package testeUnidadde;

import java.util.Objects;

public class Produto {
    private String codigoProduto;
    private String descricao;

    public Produto(String codigoProduto, String descricao) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
    }


    public String getCodigoProduto() {
        return codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "    Produto{\n" +
                "           Codigo=" + codigoProduto +
                ",\n           descricao='" + descricao + '\n' +
                "           }";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Produto)) return false;
        Produto produto = (Produto) object;
        return getCodigoProduto ().equals (produto.getCodigoProduto ()) && getDescricao ().equals (produto.getDescricao ());
    }

    @Override
    public int hashCode() {
        return Objects.hash (getCodigoProduto (), getDescricao ());
    }
}
