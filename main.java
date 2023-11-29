package projetoFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create and display the login screen
                LoginScreen loginScreen = new LoginScreen();

                // Add a listener to the login button
                loginScreen.setLoginListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Retrieve the username and password from the login screen
                        String username = loginScreen.getUsername();
                        String password = loginScreen.getPassword();

                        // Check if the username and password are correct
                        if (username.equals("admin") && password.equals("admin")) {
                            // Close the login screen
                            loginScreen.dispose();

                            // Create and display the main screen
                            MainScreen mainScreen = new MainScreen(username, "123456789");

                            // Add a listener to the check books button
                            mainScreen.setCheckBooksListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    // Create and display the book check screen
                                    BookCheckScreen bookCheckScreen = new BookCheckScreen();
                                }
                            });
                        } else {
                            // Display an error message
                            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                        }
                    }
                });
            }
        });
    }
}
