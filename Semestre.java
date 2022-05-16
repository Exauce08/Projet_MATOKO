/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetl3;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author ExaucéMariama
 */
public final class Semestre extends JFrame implements ActionListener {

    public Container c;
    private JButton backButton;
    private JLabel titleLabel, semesterLabel;
    private JComboBox cmbx;
    private Font f, font;
    private ImageIcon img;
    private final String[] semesterInfo = {"Printemps 2020", "Été 2020", "Automne 2020", "Printemps 2021","\n","Ete 2021", "Automne 2021", "Printemps 2022", "Été 2022",};

    Semestre() {
        super("Semestre Info");
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 100, 700, 430);
        this.setBackground(Color.GREEN);

        img = new ImageIcon(getClass().getResource("semestre.png"));
        this.setIconImage(img.getImage());
        
        f = new Font("Times New Roman", Font.BOLD, 22);
        font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 28);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        titleLabel = new JLabel("SEMESTRE");
        titleLabel.setFont(font);
        titleLabel.setBounds(220, 10, 250, 30);
        c.add(titleLabel);

        semesterLabel = new JLabel("Veuillez selectionner un semestre:");
        semesterLabel.setFont(f);
        semesterLabel.setBounds(20, 100, 360, 50);
        c.add(semesterLabel);

        cmbx = new JComboBox(semesterInfo);
        cmbx.setFont(f);
        cmbx.setSelectedItem("Eté_2022");
        cmbx.setBounds(340, 100, 320, 50);
        //cmbx.setEditable(true);//editable to combo box
        c.add(cmbx);

        backButton = new JButton("Retour");
        backButton.setFont(f);
        backButton.setForeground(Color.GREEN);
        backButton.setBounds(260, 220, 120, 50);
        c.add(backButton);

        cmbx.addActionListener(this);
        backButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cmbx) {
            dispose();
            Preadmission pre = new Preadmission();
            pre.setVisible(true);
        } else if (e.getSource()
                == backButton) {
            dispose();
            Etudiant s = new Etudiant();
            s.setVisible(true);
        }

    }

    public static void main(String[] args) {
        Semestre s = new Semestre();
        s.setVisible(true);
    }
}
