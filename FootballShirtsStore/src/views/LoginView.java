package views;

import models.Carrinho;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JPanel panelLogin;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton btnLogin;

    public LoginView() {
        panelLogin = new JPanel(); // Inicializando o panelLogin
        textFieldUsername = new JTextField(20);
        passwordField = new JPasswordField(20);
        btnLogin = new JButton("Login");

        setContentPane(panelLogin);
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        // Configuração do layout do painel
        panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));
        panelLogin.add(new JLabel("Usuário:"));
        panelLogin.add(textFieldUsername);
        panelLogin.add(new JLabel("Senha:"));
        panelLogin.add(passwordField);
        panelLogin.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Lógica de autenticação (simplificada)
                if (username.equals("admin") && password.equals("admin")) {
                    dispose();
                    new MainView(new Carrinho());
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        });
    }
}
