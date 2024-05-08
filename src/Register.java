import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Register implements ActionListener {

    JFrame frame = new JFrame();

    //    buttons
    JButton loginButton = new JButton("Login");
    JButton registerButton = new JButton("Register");


    //    text fields
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    //    labels
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel("",SwingConstants.CENTER);


    Register() {

//        label pos
        usernameLabel.setBounds(122,65,75,25);
        passwordLabel.setBounds(122,120,75,25);
        messageLabel.setBounds(0,165,310,25);
        messageLabel.setForeground(Color.LIGHT_GRAY);

//        fields
        usernameField.setBounds(65,90,180,25);
        passwordField.setBounds(65,145,180,25);

//       buttons
        registerButton.setBounds(110,195,90,25);
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);

        loginButton.setBounds(110,230,90,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

//      gui
        frame.setTitle("Data Analysis Solutions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,320);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

//      gui elements
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(registerButton);

//        make visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            Login login = new Login();
            frame.dispose();
        }

        if (e.getSource() == registerButton) {
            String userName = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (userName.equals("") || password.equals("")) {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Please enter a username and password");
            }
            else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?allowPublicKeyRetrieval=true&useSSL=false","root","mysql@123");

                    Statement stm = con.createStatement();

                    String query = "INSERT INTO info(username,password) VALUES('"+userName+"','"+password+"')";
                    int result = stm.executeUpdate(query);



                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    System.out.println(ex.getCause());
                }

                messageLabel.setForeground(Color.green);
                messageLabel.setText("Registration Success, Please Login");

            }
        }
    }
}
