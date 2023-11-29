package projetoFinal;

import javax.swing.*;
import java.awt.*;

public class MessageScreen extends JFrame {
    private JLabel messageLabel;
    private JLabel allowedBooksLabel;

    public MessageScreen(String message, int allowedBooks) {
        setTitle("Tela de Mensagens/Feedback");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        messageLabel = new JLabel(message);
        allowedBooksLabel = new JLabel("Número de livros permitidos por matrícula: " + allowedBooks);

        panel.add(messageLabel);
        panel.add(allowedBooksLabel);

        add(panel);
        setVisible(true);
    }
}