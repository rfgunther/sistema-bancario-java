package br.com.banco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        System.out.println("=== Banco Escola de Java - Sistema Bancário em Terminal ===\n");

        while (!sair) {
            System.out.println("Menu Principal:");
            System.out.println("1 - Criar cliente");
            System.out.println("2 - Criar conta");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n>>> Funcionalidade 'Criar cliente' em desenvolvimento...");
                    break;
                case 2:
                    System.out.println("\n>>> Funcionalidade 'Criar conta' em desenvolvimento...");
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema. Até logo!");
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
