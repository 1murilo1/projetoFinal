package projetoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainScreen extends JFrame {
    private JLabel nameLabel;
    private JLabel idLabel;
    private JButton checkBooksButton;
    private JButton logoutButton;
    private ActionListener checkBooksListener;

    public MainScreen(String nomeAluno, String matriculaAluno) {
        setTitle("Tela Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        nameLabel = new JLabel("Nome do Aluno: " + nomeAluno);
        idLabel = new JLabel("Matrícula do Aluno: " + matriculaAluno);
        checkBooksButton = new JButton("Conferir Livros");
        logoutButton = new JButton("Sair");

        panel.add(nameLabel);
        panel.add(idLabel);
        panel.add(checkBooksButton);
        panel.add(logoutButton);

        checkBooksButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBooksListener != null) {
                    checkBooksListener.actionPerformed(e);
                }
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Fazendo logout...");
                dispose();
                // Add logic to return to the login screen
            }
        });

        add(panel);
        setVisible(true);
    }

    public void setCheckBooksListener(ActionListener listener) {
        this.checkBooksListener = listener;
    }
}
