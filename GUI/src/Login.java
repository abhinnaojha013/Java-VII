import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener
{
    JLabel labelUser, labelPassword;
    JTextField textFieldUser;
    JPasswordField passwordFieldPassword;
    JButton buttonLogin, buttonReset;

    ActionListener actionListener;

    public Login()
    {
//        setLayout(new FlowLayout());
        setLayout(null);
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400, 300);
        setTitle("Login Page");

        labelUser = new JLabel("Username");
        labelPassword = new JLabel("Password");
        textFieldUser = new JTextField();
        passwordFieldPassword = new JPasswordField();
        buttonLogin = new JButton("Login");
        buttonReset = new JButton("Reset");

        add(labelUser);
        labelUser.setBounds(50, 50, 90, 20);

        add(textFieldUser);
        textFieldUser.setBounds(150, 50, 90, 20);

        add(labelPassword);
        labelPassword.setBounds(50, 80, 90, 20);

        add(passwordFieldPassword);
        passwordFieldPassword.setBounds(150, 80, 90, 20);

        add(buttonLogin);
        buttonLogin.setBounds(150, 110, 90, 20);
        buttonLogin.addActionListener(this);

        add(buttonReset);
        buttonReset.setBounds(150, 140, 90, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String uname = "Abhinna";
        String pass = "Abhinna013";

        if ((uname.equals(textFieldUser.getText().toString())) && (pass.equals((passwordFieldPassword.getText().toString()))))
        {
//            JOptionPane.showMessageDialog(null, "login success");
            new MainForm();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "login fail");
        }
    }

    public static void main(String[] args)
    {
        setDefaultLookAndFeelDecorated(true);
        new Login();
    }
}
