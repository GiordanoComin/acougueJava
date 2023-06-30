package views.venda;

public class ProdutoView {

    public static void imprimeListaProdutos() {
        System.out.print("\033[H\033[2J");
        System.out.println("===== Nossos Produtos =====");
        System.out.println("1. Lombinho - R$ 20.00");
        System.out.println("2. Moela - R$ 14.00");
        System.out.println("3. Picanha - R$ 65.99");
        System.out.println("4. Filé - R$ 69.99");
        System.out.println("5. Carne Suína - R$ 35.00");
        System.out.println("6. Mondongo - R$ 25.00");
        System.out.println("7. Sobrecoxa - R$ 15.99");
        System.out.println("8. Pata Bovina - R$ 23.99");
    }

}
