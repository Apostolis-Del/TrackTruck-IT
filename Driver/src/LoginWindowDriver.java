
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class LoginWindowDriver extends JFrame {
    private final DriverMain client;
    JTextField loginField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");

    public LoginWindowDriver() {
        super("Login");

        this.client = new DriverMain("localhost", 8818);
        client.connect();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.add(loginField);
        p.add(passwordField);
        p.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogin();
            }
        });

        getContentPane().add(p, BorderLayout.CENTER);

        pack();

        setVisible(true);
    }

    private void doLogin() {
        String login = loginField.getText();
        String password = passwordField.getText();

        try {
            if (client.login(login, password)) {
                // bring up the user list window
                UserListPaneDriver userListPane = new UserListPaneDriver(client);
                JFrame frame = new JFrame("User List");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 600);

                frame.getContentPane().add(userListPane, BorderLayout.CENTER);
                frame.setVisible(true);

                setVisible(false);
            } else {
                // show error message
                JOptionPane.showMessageDialog(this, "Invalid login/password.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoginWindowDriver loginWin = new LoginWindowDriver();
        loginWin.setVisible(true);
    }
}
