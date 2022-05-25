package TratamentoErros.CheckedException;


import javax.swing.*;
import java.io.*;

/*Imprimir um arquivo no console*/
public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "A_volta_dos_que_nao_foram.txt";
        try {
            imprimirNoConsole(nomeArquivo);

        } catch (FileNotFoundException fileNotFound) {
            //JOptionPane.showMessageDialog(null,"Arquivo não Encontrado ! Cause: " + fileNotFound.getCause());
            JOptionPane.showMessageDialog(null, "Arquivo não Encontrado ! Message: " + fileNotFound.getMessage());
            //JOptionPane.showMessageDialog(null,"Arquivo não Encontrado ! LocalizedMessage: " + fileNotFound.getLocalizedMessage());
            //JOptionPane.showMessageDialog(null,"Arquivo não Encontrado ! InStackTrace:" + fileNotFound.fillInStackTrace());

        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Erro inesperado, entre em contato com o suporte" + exception.getMessage());
            exception.fillInStackTrace();
        } finally {
            System.out.println("Dentro do Finally");
        }

        System.out.println("Com Exception ou Sem Exception o programa continua");
    }

    public static void imprimirNoConsole(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo.getName()));
        String line = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        } while (line != null);

        bufferedWriter.flush();
        bufferedReader.close();
    }
}
