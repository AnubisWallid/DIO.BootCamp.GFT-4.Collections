package TratamentoErros.UncheckedException;

import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                } else if (denominador[i] == 0) {
                    throw new DivisaoNaoExataException("Divisão por 0", numerador[i], denominador[i]);

                }
                int resultado = numerador[i] / denominador[i];
                System.out.println("Divisao de " + numerador[i] + " / " + denominador[i] + " = " + resultado);
                System.out.println("Continuação...");
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        }
    }
}

class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int denominador;


    DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}