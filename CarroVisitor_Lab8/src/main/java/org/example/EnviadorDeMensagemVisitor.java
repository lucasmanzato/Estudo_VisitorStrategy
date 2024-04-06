package org.example;

public class EnviadorDeMensagemVisitor implements VisitanteVeiculo {
    @Override
    public void visitar(Carro carro) {
        System.out.println("Carro: Favor atualizar dados do IPVA.");
    }

    @Override
    public void visitar(Bicicleta bicicleta) {
        System.out.println("Bicicleta: Comemore no parque o dia do ciclismo!");
    }

    @Override
    public void visitar(Onibus onibus) {
        System.out.println("Ônibus: Atenção para atualização das licenças.");
    }
}
