package org.example;

// Principal.java
public class Main{
    public static void main(String[] args) {
        Veiculo carro = new Carro("Vermelho", "Toyota", "Corolla");
        Veiculo bicicleta = new Bicicleta("Azul");
        Veiculo onibus = new Onibus(30, "2012");

        VisitanteVeiculo impressora = new ImpressoraDeDadosVisitor();
        VisitanteVeiculo mensageiro = new EnviadorDeMensagemVisitor();

        carro.aceitar(impressora);
        bicicleta.aceitar(impressora);
        onibus.aceitar(impressora);

        carro.aceitar(mensageiro);
        bicicleta.aceitar(mensageiro);
        onibus.aceitar(mensageiro);
    }
}
