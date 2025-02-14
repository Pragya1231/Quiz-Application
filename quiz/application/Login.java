package quiz.application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.net.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/login1.jpeg"));
        JLabel image = new JLabel(i1);
        setLayout(null);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simple Quiz");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(780,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
