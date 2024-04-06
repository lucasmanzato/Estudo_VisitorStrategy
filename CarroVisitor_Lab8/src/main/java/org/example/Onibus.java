package org.example;

public class Onibus implements Veiculo {
    private int lugares;
    private String anoDeFabricacao;

    public Onibus(int lugares, String anoDeFabricacao) {
        this.lugares = lugares;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    @Override
    public void aceitar(VisitanteVeiculo visitante) {
        visitante.visitar(this);
    }
}
