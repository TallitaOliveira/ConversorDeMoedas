import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (true) {
            System.out.println("\n==== BEM VINDO AO NOSSO CONVERSOR DE MOEDA ====");


            System.out.println("1. BRL para USD");
            System.out.println("2. BRL para EUR");
            System.out.println("3. BRL para GBP");
            System.out.println("4. BRL para ARS");
            System.out.println("5. BRL para CLP");
            System.out.println("6. USD para BRL");
            System.out.println("7. EUR para BRL");
            System.out.println("8. GBP para BRL");
            System.out.println("9. ARS para BRL");
            System.out.println("10. CLP para BRL");
            System.out.println("0. Sair");


            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            String from = "";
            String to = "";

            switch (opcao) {
                case 1: from = "BRL"; to = "USD"; break;
                case 2: from = "BRL"; to = "EUR"; break;
                case 3: from = "BRL"; to = "GBP"; break;
                case 4: from = "BRL"; to = "ARS"; break;
                case 5: from = "BRL"; to = "CLP"; break;
                case 6: from = "USD"; to = "BRL"; break;
                case 7: from = "EUR"; to = "BRL"; break;
                case 8: from = "GBP"; to = "BRL"; break;
                case 9: from = "ARS"; to = "BRL"; break;
                case 10: from = "CLP"; to = "BRL"; break;
                default: System.out.println("Opção inválida"); continue;
            }

            System.out.print("Digite o valor para conversão: ");
            double valor = scanner.nextDouble();

            double convertido = conversor.converter(from, to, valor);
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, from, convertido, to);
        }

        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}
