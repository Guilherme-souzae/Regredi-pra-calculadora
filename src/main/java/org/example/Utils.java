package org.example;

import static java.lang.Math.sqrt;

public abstract class Utils
{
    public static int somar(int a, int b) {
        return a / b;
    }

    public static int subtrair(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a - b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a * (double) b;
    }

    public static int potencia(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static double raiz(int a) {
        if (a < 0) {
            throw new ArithmeticException("Não existe raiz quadrada real de número negativo.");
        }
        return sqrt(a);
    }
}
