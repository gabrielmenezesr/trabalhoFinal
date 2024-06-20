package views;

import models.Produto;
import models.Carrinho;
import models.ItemVenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainView extends JFrame {
    private JPanel panelMain;
    private JButton btnCart;
    private JPanel productsPanel;
    private List<Produto> produtos;
    private Carrinho carrinho;

    public MainView(Carrinho carrinho) {
        this.carrinho = carrinho;
        panelMain = new JPanel();
        btnCart = new JButton("Ver Carrinho");
        productsPanel = new JPanel();
        produtos = new ArrayList<>();

        setContentPane(panelMain);
        setTitle("Vitrine de Produtos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panelMain.setLayout(new BorderLayout());
        panelMain.add(productsPanel, BorderLayout.CENTER);
        panelMain.add(btnCart, BorderLayout.SOUTH);

        productsPanel.setLayout(new GridLayout(0, 3, 10, 10));

        // Adiciona produtos à lista
        produtos.add(new Produto(1, "Camisa Messi", 99.99, "imagens/messi.jpg"));
        produtos.add(new Produto(2, "Camisa Ronaldo", 89.99, "imagens/ronaldo.jpg"));
        produtos.add(new Produto(3, "Camisa Neymar", 79.99, "imagens/neymar.jpg"));
        produtos.add(new Produto(4, "Camisa Mbappe", 69.99, "imagens/mbappe.jpg"));
        produtos.add(new Produto(5, "Camisa Salah", 59.99, "imagens/salah.jpg"));

        // Adiciona produtos ao painel
        for (Produto produto : produtos) {
            JPanel productPanel = new JPanel();
            productPanel.setLayout(new BorderLayout());

            JLabel lblNome = new JLabel(produto.getNome());
            lblNome.setHorizontalAlignment(SwingConstants.CENTER);

            JLabel lblImage = new JLabel();
            lblImage.setHorizontalAlignment(SwingConstants.CENTER);
            lblImage.setIcon(new ImageIcon(produto.getImagePath()));

            JButton btnAddToCart = new JButton("Adicionar ao Carrinho");
            btnAddToCart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Adiciona o produto ao carrinho
                    carrinho.adicionarItem(new ItemVenda(produto, 1));
                    JOptionPane.showMessageDialog(null, produto.getNome() + " adicionado ao carrinho!");
                }
            });

            productPanel.add(lblNome, BorderLayout.NORTH);
            productPanel.add(lblImage, BorderLayout.CENTER);
            productPanel.add(btnAddToCart, BorderLayout.SOUTH);

            productsPanel.add(productPanel);
        }

        btnCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new CartView(carrinho);
            }
        });
    }
}
