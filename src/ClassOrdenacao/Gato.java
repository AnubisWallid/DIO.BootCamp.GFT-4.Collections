package ClassOrdenacao;

public class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome,Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", idade= " + idade +
                ", cor= " + cor + "\n";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
