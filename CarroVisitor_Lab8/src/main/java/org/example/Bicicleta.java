package org.example;

public class Bicicleta implements Veiculo {
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void aceitar(VisitanteVeiculo visitante) {
        visitante.visitar(this);
    }
}