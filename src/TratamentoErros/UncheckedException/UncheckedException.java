package TratamentoErros.UncheckedException;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String num1;
        String num2;
        boolean doWhile = true;
        do {

                try {
                    num1 = JOptionPane.showInputDialog("Numerador: ");
                    num2 = JOptionPane.showInputDialog("Denominador: ");
                    double resultado = dividir(Double.parseDouble(num1), Double.parseDouble(num2));
                    System.out.println("Resultado: " + resultado);
                    doWhile = false;
                }catch (NumberFormatException exceptionNoResultado){
        //            exceptionNoResultado.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Entrada invalida.\n"+ exceptionNoResultado.getMessage());
                }catch (ArithmeticException exceptionNaFuncaoDividir){
                    JOptionPane.showMessageDialog(null,"Impossivel dividir por 0.\n"+ exceptionNaFuncaoDividir.getMessage());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    System.out.println("Dentro do bloco finally");
                }
            }while (doWhile);

        System.out.println("fora do DO/While...\nContinua...");

    }
        private static double dividir ( double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException();}
            return Math.floor(num1 / num2);
        }
}