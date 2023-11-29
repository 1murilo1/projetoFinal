package projetoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookCheckScreen extends JFrame {
    private JList<String> bookList;
    private JButton confirmButton;

    public BookCheckScreen() {
        setTitle("Tela de Conferência de Livros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        DefaultListModel<String> bookListModel = new DefaultListModel<>();
        bookListModel.addElement("Livro 1");
        bookListModel.addElement("Livro 2");
        bookListModel.addElement("Livro 3");
        bookListModel.addElement("Livro 4");

        bookList = new JList<>(bookListModel);
        bookList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(bookList);

        confirmButton = new JButton("Confirmar Empréstimo");

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(confirmButton, BorderLayout.SOUTH);

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] selectedBooks = bookList.getSelectedValuesList().toArray(new String[0]);
                String message = "Livros selecionados para empréstimo:\n";
                for (String book : selectedBooks) {
                    message += book + "\n";
                }
                JOptionPane.showMessageDialog(null, message);
            }
        });

        add(panel);
        setVisible(true);
    }
}
