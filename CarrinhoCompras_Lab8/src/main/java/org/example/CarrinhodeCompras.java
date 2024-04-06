package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private FreteStrategy freteStrategy;

    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item){
        items.add(item);

    }
    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);

    }
    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public double calculaFrete() {
        if (freteStrategy == null) {
            throw new IllegalStateException("Frete strategy not set");
        }
        return freteStrategy.calculaFrete();
    }
}
