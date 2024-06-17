package views;

import models.Carrinho;
import models.ItemVenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartView extends JFrame {
    private JPanel panelCart;
    private JList<String> listCartItems;
    private DefaultListModel<String> listModel;
    private JButton btnRemoveItem;
    private JButton btnCheckout;
    private Carrinho carrinho;

    public CartView(Carrinho carrinho) {
        this.carrinho = carrinho;
        panelCart = new JPanel(); // Inicializando o panelCart
        listCartItems = new JList<>();
        listModel = new DefaultListModel<>();
        btnRemoveItem = new JButton("Remover Item");
        btnCheckout = new JButton("Finalizar Compra");

        setContentPane(panelCart);
        setTitle("Carrinho de Compras");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        // Configuração do layout do painel
        panelCart.setLayout(new BoxLayout(panelCart, BoxLayout.Y_AXIS));
        panelCart.add(new JScrollPane(listCartItems));
        panelCart.add(btnRemoveItem);
        panelCart.add(btnCheckout);

        listCartItems.setModel(listModel);

        // Adiciona itens ao carrinho
        for (ItemVenda item : carrinho.getItens()) {
            listModel.addElement(item.getProduto().getNome() + " - $" + item.getProduto().getPreco());
        }

        btnRemoveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = listCartItems.getSelectedIndex();
                if (selectedIndex != -1) {
                    carrinho.removerItem(carrinho.getItens().get(selectedIndex));
                    listModel.remove(selectedIndex);
                }
            }
        });

        btnCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new PaymentView(carrinho);
            }
        });
    }
}
