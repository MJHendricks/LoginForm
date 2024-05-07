
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Login implements ActionListener {

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

    HashMap<String,String> loginInfo = new HashMap<>();

    Login(HashMap<String, String> loginInfoCopy) {
        loginInfo = loginInfoCopy;

//        label pos
        usernameLabel.setBounds(122,65,75,25);
        passwordLabel.setBounds(122,120,75,25);
        messageLabel.setBounds(0,165,310,25);
        messageLabel.setForeground(Color.LIGHT_GRAY);

//        fields
        usernameField.setBounds(65,90,180,25);
        passwordField.setBounds(65,145,180,25);

//       buttons
        loginButton.setBounds(110,195,90,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        registerButton.setBounds(110,230,90,25);
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);

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
            String userID = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            try {
//                open sql connection
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","mysql@123");

                Statement stm = con.createStatement();

                String query = "SELECT * FROM login WHERE username = '"+userID+"' AND password = '"+password+"'";
                ResultSet result = stm.executeQuery(query);


                if (result.next()) {
                    Welcome welcome = new Welcome();
                    frame.dispose();

                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Username/Password Incorrect");
                    usernameField.setText("");
                    passwordField.setText("");
                }
                con.close();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.getCause());
            }


        }

        if (e.getSource() == registerButton) {
            Register reg = new Register();
            frame.dispose();
        }
    }
}
