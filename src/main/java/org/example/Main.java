package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int aux = 1;
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        do {

            System.out.println("Digite o primeiro numero: ");
            BigDecimal valor1 = scan.nextBigDecimal();

            System.out.println("Digite o segundo numero: ");
            BigDecimal valor2 = scan.nextBigDecimal();

            System.out.println("Digite o operador: ");
            String operador = scan.next();


            switch (operador) {

                case "+":
                    System.out.println("Resultado: " + calculadora.soma(valor1, valor2));
                    break;
                case "-":
                    System.out.println("Resultado: " + calculadora.subtracao(valor1, valor2));
                    break;
                case "/":
                    System.out.println("Resultado: " + calculadora.divisao(valor1, valor2));
                    break;
                case "*":
                    System.out.println("Resultado: " + calculadora.multiplicacao(valor1, valor2));
                    break;
                default:
                    System.out.println("Operador Invalido");
            }

            System.out.println("\nDigite 1 para continuar ou 0 para finalizar!");
            aux = scan.nextInt();

        }while (aux != 0);
    }
}