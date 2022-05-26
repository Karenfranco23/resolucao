package questao3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de um ingrediente:");
        String ingrediente = entrada.next();

        System.out.println("Digite a quantidade do ingrediente:");
        int quantidade = entrada.nextInt();

        Ingrediente ing1 = new Ingrediente("Tomate", 1);
        Ingrediente ing2 = new Ingrediente("Cebola", 1);
        Ingrediente ing3 = new Ingrediente("Queijo", 1);
        Ingrediente ing4 = new Ingrediente("Presunto", 1);
        Ingrediente ing5 = new Ingrediente("Azeitona", 1);

        Receita rec1 = new Receita("Pizza", Arrays.asList(ing1, ing2, ing3), 1, "Faça assim:");
        Receita rec2 = new Receita("Lasanha", Arrays.asList(ing2, ing5, ing4), 1, "Faça assim:");
        Receita rec3 = new Receita("Strogonoff", Arrays.asList(ing3, ing2, ing4), 1, "Faça assim:");
        Receita rec4 = new Receita("Arroz de forno", Arrays.asList(ing4, ing2, ing1), 1, "Faça assim:");
        Receita rec5 = new Receita("Nhoque", Arrays.asList(ing5, ing4, ing3), 1, "Faça assim:");

        List<Receita> receitas = Arrays.asList(rec1, rec2, rec3, rec4, rec5);

        List<Receita> filtro = new ArrayList<>();

        for(Receita rec : receitas) {

        }
    }
}
