package models;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, quantidade);
    }

    public int verificarEstoque(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }

    public void removerProduto(Produto produto, int quantidade) {
        int estoqueAtual = produtos.getOrDefault(produto, 0);
        if (estoqueAtual >= quantidade) {
            produtos.put(produto, estoqueAtual - quantidade);
        }
    }

    // Getters e setters
    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Produto, Integer> produtos) {
        this.produtos = produtos;
    }
}
