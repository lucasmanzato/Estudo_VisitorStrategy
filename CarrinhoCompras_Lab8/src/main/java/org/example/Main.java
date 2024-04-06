package org.example;

public class Main {

    public static void main(String ... args){
        CarrinhodeCompras carrinho = new CarrinhodeCompras();

        carrinho.adicionaItem(new Item("livro x", 50) );
        carrinho.adicionaItem(new Item("tenis y", 800));

        // supondo que o usuario escolheu pagar com pix
        PagamentoStrategy strategy = new PixPagamento();

        carrinho.realizaPagamento(strategy);

        FreteStrategy freteStrategy = new SedexFrete();
        carrinho.setFreteStrategy(freteStrategy);
        double frete = carrinho.calculaFrete();

        System.out.println("Total frete: " + frete);
    }
}