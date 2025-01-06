package projeto;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exibir todas as opções para o usuário escolher

        int opcao;

        do {

            System.out.println("Calculadora Java");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                // Resgatar números dos usuários para realizar a operação
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println(num1 + " " + num2);

                // Encontrar o Resultado

                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Não é possível dividir por zero");
                            operacaoValida = false;

                        }
                        break;
                    default:
                        operacaoValida = false;
                        break;
                }

                // mostrar o resultado

                if (operacaoValida) {
                    System.out.println("Resultado: " + resultado);
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        // Liberar espaço na memória

        System.out.println("Obrigado por usar a calculadora Java");
        scanner.close();

    }

    // OPERAÇÕES

    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

}
