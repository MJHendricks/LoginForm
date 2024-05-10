import javax.swing.*;

public class Welcome {

    JFrame welcomeFrame = new JFrame();
    JLabel label = new JLabel("Thank you for viewing this project.",SwingConstants.CENTER);
    JLabel label2 = new JLabel("Please consider viewing my other projects at: ",SwingConstants.CENTER);
    JLabel label3 = new JLabel("mjhendricks.github.io",SwingConstants.CENTER);

    Welcome() {

        welcomeFrame.setTitle("Java/SQL Project by MJ Hendricks");
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(320,320);
        welcomeFrame.setLayout(null);
        welcomeFrame.setLocationRelativeTo(null);

        label.setBounds(0,60,320,40);
        label2.setBounds(0,100,320,40);
        label3.setBounds(0,140,310,50);
        welcomeFrame.add(label);
        welcomeFrame.add(label2);
        welcomeFrame.add(label3);

        welcomeFrame.setVisible(true);
    }
}
