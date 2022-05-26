package questao1;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Fulano");
        p1.setGenero("Feminino");
        p1.setCorDosOlhos("Castanho");

        int retorna = p1.retornaIdade();


    }
}
