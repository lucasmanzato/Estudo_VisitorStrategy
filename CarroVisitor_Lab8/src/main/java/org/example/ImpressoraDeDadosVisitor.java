package org.example;
public class ImpressoraDeDadosVisitor implements VisitanteVeiculo {
    @Override
    public void visitar(Carro carro) {
        System.out.println("Carro: Cor - " + carro.getCor() + ", Marca - " + carro.getMarca() + ", Modelo - " + carro.getModelo());
    }

    @Override
    public void visitar(Bicicleta bicicleta) {
        System.out.println("Bicicleta: Cor - " + bicicleta.getCor());
    }

    @Override
    public void visitar(Onibus onibus) {
        System.out.println("Ônibus: Lugares - " + onibus.getLugares() + ", Ano de Fabricação - " + onibus.getAnoDeFabricacao());
    }
}

// EnviadorDeMensagemVisitor.java
