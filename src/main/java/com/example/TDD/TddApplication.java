package com.example.TDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testeUnidadde.CarrinhoDeCompras;
import testeUnidadde.ItemCarrinho;
import testeUnidadde.Produto;

@SpringBootApplication
public class TddApplication {


	private static Object ItemCarrinho = new CarrinhoDeCompras ().getItens ();

	public static void main(String[] args) {

		Produto Exame, Hilab;
		Exame = new Produto ("01", "exame");
		Hilab = new Produto ("02", "Hilab");
		ItemCarrinho item1 = new ItemCarrinho (Exame, 22, 3);
		ItemCarrinho item2 = new ItemCarrinho (Hilab, 12, 5);

		item1.adicionarItem (Hilab,15, 2);
		item2.adicionarItem (Exame, 31,5);
//		item1.getItens ();
//		item1.getValor ();
//		item1.getQuantidade ();
//		item1.getValorTotal ();
//		item1.getValorUnit ();
//		item1.getValorTotal ();
		

		System.out.println (item1 + "\n" + item2);


	}

}
