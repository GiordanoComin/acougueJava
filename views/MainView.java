package views;

import java.util.Scanner;

import entities.Venda;
import views.venda.ProdutoView;
import views.venda.VendaItensView;
import views.venda.VendaMainView;

public class MainView {
    public static void telaBoasVindas() {
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("=========================");
            System.out.println("BEM VINDO(A) AO AÇOUGUE");
            System.out.println("=========================");
            System.out.println("Escolha uma opção:");
            System.out.println("(1) - Vizualizar nossos produtos");
            System.out.println("(2) - Realizar compra");
            System.out.println("(0) - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ProdutoView.imprimeListaProdutos();
                    System.out.println("--------------------------");
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 2:
                    VendaMainView.imprimeTelaVendaIncial();
                    break;
                default:
                    break;
            }

        } while (true);
    }
}