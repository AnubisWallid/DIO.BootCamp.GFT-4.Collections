package TratamentoErros.CheckedException;


import java.io.File;

/*Imprimir um arquivo no console*/
public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "A volta dos que não foram.txt";
        imprimirNoConsole(nomeArquivo);

        System.out.println("Com Exception ou Sem Exception o programa continua");
    }
public static void imprimirNoConsole(String nomeArquivo){
    File arquivo = new File(nomeArquivo);
}
}
