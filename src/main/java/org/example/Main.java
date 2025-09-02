package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import static org.example.Utils.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Potenciação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();

            try {
                switch (opt) {
                    case 1: // Soma
                        System.out.print("Digite o primeiro número: ");
                        int a1 = sc.nextInt();
                        System.out.print("Digite o segundo número: ");
                        int b1 = sc.nextInt();
                        System.out.println("Resultado: " + somar(a1, b1));
                        break;

                    case 2: // Subtração
                        System.out.print("Digite o primeiro número: ");
                        int a2 = sc.nextInt();
                        System.out.print("Digite o segundo número: ");
                        int b2 = sc.nextInt();
                        System.out.println("Resultado: " + subtrair(a2, b2));
                        break;

                    case 3: // Multiplicação
                        System.out.print("Digite o primeiro número: ");
                        int a3 = sc.nextInt();
                        System.out.print("Digite o segundo número: ");
                        int b3 = sc.nextInt();
                        System.out.println("Resultado: " + multiplicar(a3, b3));
                        break;

                    case 4: // Divisão
                        System.out.print("Digite o dividendo: ");
                        int a4 = sc.nextInt();
                        System.out.print("Digite o divisor: ");
                        int b4 = sc.nextInt();
                        System.out.println("Resultado: " + dividir(a4, b4));
                        break;

                    case 5: // Raiz quadrada
                        System.out.print("Digite o número: ");
                        int a5 = sc.nextInt();
                        System.out.println("Resultado: " + raiz(a5));
                        break;

                    case 6: // Potenciação
                        System.out.print("Digite a base: ");
                        int base = sc.nextInt();
                        System.out.print("Digite o expoente: ");
                        int exp = sc.nextInt();
                        System.out.println("Resultado: " + potencia(base, exp));
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opt != 0);

        sc.close();
    }
}