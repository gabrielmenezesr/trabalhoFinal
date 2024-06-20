package views;

import models.Carrinho;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentView extends JFrame {
    private JPanel panelPayment;
    private JTextField textFieldCardNumber;
    private JTextField textFieldExpiryDate;
    private JTextField textFieldCVV;
    private JButton btnConfirmPayment;
    private Carrinho carrinho;

    public PaymentView(Carrinho carrinho) {
        this.carrinho = carrinho;
        panelPayment = new JPanel(); // Inicializando o panelPayment
        textFieldCardNumber = new JTextField(20);
        textFieldExpiryDate = new JTextField(20);
        textFieldCVV = new JTextField(4);
        btnConfirmPayment = new JButton("Confirmar Pagamento");

        setContentPane(panelPayment);
        setTitle("Pagamento");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        // Configuração do layout do painel
        panelPayment.setLayout(new BoxLayout(panelPayment, BoxLayout.Y_AXIS));
        panelPayment.add(new JLabel("Número do Cartão:"));
        panelPayment.add(textFieldCardNumber);
        panelPayment.add(new JLabel("Data de Validade:"));
        panelPayment.add(textFieldExpiryDate);
        panelPayment.add(new JLabel("CVV:"));
        panelPayment.add(textFieldCVV);
        panelPayment.add(btnConfirmPayment);

        btnConfirmPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de pagamento (simplificada)
                JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                dispose();
                new MainView(new Carrinho());
            }
        });
    }
}
