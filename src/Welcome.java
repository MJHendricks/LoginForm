import javax.swing.*;

public class Welcome {

    JFrame welcomeFrame = new JFrame();
    JLabel label = new JLabel("Thank you for viewing this project.",SwingConstants.CENTER);

    Welcome() {

        welcomeFrame.setTitle("Data Analysis by MJ Hendricks");
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(320,320);
        welcomeFrame.setLayout(null);
        welcomeFrame.setLocationRelativeTo(null);

        label.setBounds(0,40,320,50);
        welcomeFrame.add(label);

        welcomeFrame.setVisible(true);
    }
}
