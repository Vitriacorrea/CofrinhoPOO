package cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\n==== MENU COFRINHO ====");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a moeda: 1-Real 2-Dólar 3-Euro");
                    int tipo = Integer.parseInt(sc.nextLine());
                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    switch (tipo) {
                        case 1: cofrinho.adicionar(new Real(valor)); break;
                        case 2: cofrinho.adicionar(new Dolar(valor)); break;
                        case 3: cofrinho.adicionar(new Euro(valor)); break;
                        default: System.out.println("Moeda inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Escolha a moeda para remover: 1-Real 2-Dólar 3-Euro");
                    tipo = Integer.parseInt(sc.nextLine());
                    System.out.print("Valor: ");
                    valor = Double.parseDouble(sc.nextLine());

                    switch (tipo) {
                        case 1: cofrinho.remover(new Real(valor)); break;
                        case 2: cofrinho.remover(new Dolar(valor)); break;
                        case 3: cofrinho.remover(new Euro(valor)); break;
                        default: System.out.println("Moeda inválida.");
                    }
                    break;
                case 3:
                    cofrinho.listar();
                    break;
                case 4:
                    cofrinho.totalConvertido();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
