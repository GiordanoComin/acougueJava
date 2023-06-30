package services;

import entities.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private static List<Produto> listaProdutos = new ArrayList<>();

    static {
        listaProdutos.add(new Produto(1, "Pé Suíno", 20.00));
        listaProdutos.add(new Produto(2, "Moela", 14.00));
        listaProdutos.add(new Produto(3, "Picanha", 65.99));
        listaProdutos.add(new Produto(4, "Filé", 69.99));
        listaProdutos.add(new Produto(5, "Carne Suína", 35.00));
        listaProdutos.add(new Produto(6, "Mondongo", 25.00));
        listaProdutos.add(new Produto(7, "Sobrecoxa", 15.99));
        listaProdutos.add(new Produto(8, "Pata Bovina", 23.99));
    }

    public List<Produto> findAll() {
        return listaProdutos;
    }

    public Produto findById(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id)
                return produto;
        }
        return null;
    }
}
