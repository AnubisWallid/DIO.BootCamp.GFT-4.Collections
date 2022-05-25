package TratamentoErros.UncheckedException;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Numerador: ");
        String num2 = JOptionPane.showInputDialog("Denominador: ");

        int resultado = dividir(Integer.parseInt(num1),Integer.parseInt(num2));
        System.out.println("Resultado: "+ resultado);
    }

    private static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
