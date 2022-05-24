package List.ClassOrdenacao;

import java.util.Comparator;

public class ComparatorNomeIdadeCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        int idade = g1.getIdade().compareTo(g2.getIdade());
        if (idade != 0) return idade;
        return g1.getCor().compareToIgnoreCase(g2.getCor());

    }
}
