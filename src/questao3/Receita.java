package questao3;

import java.util.List;

public class Receita {
    private String nome;
    private List<Ingrediente> ingredientes;
    private int tempoPreparo;
    private String modoPreparo;

    public Receita(String nome, List<Ingrediente> ingredientes, int tempoPreparo, String modoPreparo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tempoPreparo = tempoPreparo;
        this.modoPreparo = modoPreparo;
    }
}