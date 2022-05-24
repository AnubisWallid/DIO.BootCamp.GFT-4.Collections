package List;

import List.ClassOrdenacao.ComparatorIdade;
import List.ClassOrdenacao.ComparatorCor;
import List.ClassOrdenacao.ComparatorNomeIdadeCor;
import List.ClassOrdenacao.Gato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        /*Dadas as seguintes informações sobre meus gatos, crie uma lista
        e ordene esta lista exibindo:
        (nome - idade - cor);

        Gato 1 = nome: Jon, idade: 18, cor: preto
        Gato 2 = nome: Simba, idade: 6, cor: tigrado
        Gato 3 = nome: Jon, idade: 12, cor: amarelo
        Gato 3 = nome: Luke, idade: 9, cor: branco
        */
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
            add(new Gato("Luke",18,"rajado"));
        }};
        gatos.add(new Gato("Luke",18,"branco"));

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(gatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(gatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(gatos);
        System.out.println(gatos);


        System.out.println("--\tOrdem Idade\t---");
        Comparator<Gato> ComparatorIdade = new ComparatorIdade();
//        Collections.sort(gatos, ComparatorIdade);
        gatos.sort(ComparatorIdade);
        System.out.println(gatos);

        System.out.println("--\tOrdem cor\t---");
        Comparator<Gato> ComparatorCor = new ComparatorCor();
        gatos.sort(ComparatorCor);
        System.out.println(gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Comparator<Gato> ComparatorNomeIdadeCor = new ComparatorNomeIdadeCor();
        gatos.sort(ComparatorNomeIdadeCor);
        System.out.println(gatos);



    }
}

