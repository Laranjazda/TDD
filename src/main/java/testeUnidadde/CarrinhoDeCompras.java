package testeUnidadde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> listaItens;

    public void adicionarItem(Produto produto, double valorUnit, int quantidade){
       int posicaoItem = -1;
       ItemCarrinho itemCarrinho = new ItemCarrinho (produto, valorUnit, quantidade);
       for (int pos = 0; pos < itemCarrinho.getItens ().size () & posicaoItem <0; pos++ ){
           ItemCarrinho itemCarrinho1 = listaItens.get (pos);

           if (itemCarrinho1.getProduto ().equals (produto)){
               posicaoItem = pos;
           }
       }

       try {
           if (posicaoItem < 0){
               ItemCarrinho item = new ItemCarrinho (produto,valorUnit,quantidade);
               item.setValor (item.getValorTotal ());
               getItens ().add (item);
           }else {
               ItemCarrinho itemTemp = listaItens.get (posicaoItem);
               quantidade = itemTemp.getQuantidade ()+quantidade;
               valorUnit = itemTemp.getValorUnit () == valorUnit ? valorUnit = itemTemp.getValorUnit () : valorUnit;
               ItemCarrinho item = new ItemCarrinho (produto,valorUnit,quantidade);
               item.setValor (item.getValorTotal ());

               listaItens.set (posicaoItem, item);
           }
       } catch (RuntimeException e){
           e.getStackTrace ();
       }

    }

    public boolean removeItemCarrinho(Produto produto){
        int posicaoItem = -1;

        for (int pos = 0; pos < getItens ().size () & posicaoItem < 0; pos++){
            ItemCarrinho item = listaItens.get (pos);

            if (item.getProduto ().equals (produto)){
                posicaoItem = pos;
            }
        }
        if (posicaoItem > -1){
            getItens ().remove (posicaoItem);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerItemCarrinho(int posicao){
        try {
            listaItens.remove (posicao);
            return true;
        } catch (RuntimeException e){
            return false;
        }
    }

    public double getValorTotal(){
        getItens ().stream ().forEach (s -> s.getValorTotal ());
        return 0;
    }

    public Collection<ItemCarrinho> getItens() {
        if(listaItens == null) {
            listaItens = new ArrayList<> ();
        }
        return listaItens;
    }

}
