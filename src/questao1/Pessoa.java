package questao1;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String genero;
    private String corDosOlhos;
    private String corDoCabelo;
    private LocalDate dataDeNascimento;
    private char tipoSanguineo;
    private String fatorRh;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public char getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(char tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }

    public int retornaIdade() {

        int idade = LocalDate.now().getYear() - this.dataDeNascimento.getYear();
        return idade;
    }

    public void corDeOlho() {

    }
}
