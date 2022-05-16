/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetl3;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Exaucé
 */
public class Login extends JFrame {
     private Container c;
    private JLabel welcomeLabel, label1, label2;
    private JTextField tf;
    private JPasswordField pf;
    private JButton login_button, clear_button;
    private Font f, font;
    private ImageIcon img1,img2,img3;

    Login() {

        loginComponents();

    }

    public void loginComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 630, 520);
        this.setTitle("Login Demo");
        this.setResizable(false);

        //Content Pane 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        img1 = new ImageIcon(getClass().getResource("login_title.png"));
        this.setIconImage(img1.getImage());
        img2 = new ImageIcon(getClass().getResource("identifiant.png"));
        img3 = new ImageIcon(getClass().getResource("mot_de_passe.png"));
       
        
        //Font
        f = new Font("Times New Roman", Font.BOLD, 20);
        font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 28);
        
        welcomeLabel = new JLabel("BIENVENUE");
        welcomeLabel.setFont(font);
        welcomeLabel.setBounds(220, 20, 150, 50);
        welcomeLabel.setForeground(Color.BLACK);
        c.add(welcomeLabel);
        //JLabel - 1
        label1 = new JLabel(img2);
        label1.setFont(f);
        label1.setBounds(30, 100,  img2.getIconWidth(), img2.getIconHeight());
        label1.setToolTipText("Entrez votre identifiant");
        c.add(label1);
        //JTextField
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(160, 100, 290, 60);
        c.add(tf);
        //JLabel - 2
        label2 = new JLabel(img3);
        label2.setFont(f);
        label2.setBounds(30, 200, img3.getIconWidth(), img3.getIconHeight());
        label2.setToolTipText("Entrez le mot de passe");
        c.add(label2);
        pf = new JPasswordField();
        pf.setFont(f);
        pf.setBounds(160, 200, 290, 60);
        c.add(pf);
        login_button = new JButton("Connexion");
        login_button.setFont(f);
        login_button.setBounds(135, 310, 100, 50);
        c.add(login_button);

        clear_button = new JButton("Réinitialiser");
        clear_button.setFont(f);
        clear_button.setBounds(320, 310, 100, 50);
        c.add(clear_button);
        //ActionListener
        clear_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });
        login_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = tf.getText();
                String password = pf.getText();
                if (userName.equals("matoko") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Connexion réussi");
                    dispose();
                    Etudiant s = new Etudiant();
                    s.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Mot de passe ou Identifiant incorrect");
                }

            }
        });
    }
}
