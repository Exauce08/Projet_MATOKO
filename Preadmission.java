/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetl3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Exaucé and mariama
 */
public class Preadmission extends JFrame implements ActionListener {

    private Container c;
    private ImageIcon img1, img2;
    private Font f, font;
    private Date date;
    private JLabel courseLabel, priorityLabel, choosenLabel;
    private JButton addButton, deleteButton, backButton, saveButton;
    private JComboBox cmbx1, cmbx2;
    private JTable table;
    private JTableHeader header;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] coursesList = {"CSE115", "CSE115L", "CSE173", "CSE215", "CSE215L", "CSE225",
        "CSE225L", "CSE231", "CSE231L", "CSE299", "CSE332", "CSE311", "CSE331L", "CSE323", "CSE327",
        "CSE499A", "MAT116", "MAT120", "MAT125", "MAT130", "MAT250", "MAT350", "MAT361", "PHY107", "PHY107L",
        "CHE101", "CHE101L", "BIO103", "BIO103L", "BEN205", "ENG102", "ENG103", "ENG111", "EEE111", "EEE111L",
        "EEE141", "EEE141L", "EEE154", "EEE452", "POL101", "ECO101"};

    private final String[] priorityList = {"1", "2", "3", "4", "5"};

    private final String[] courseName = {"Langage de programmation\",\"Langage de programmation \",\"Mathématiques discrètes\",\"Langage de programmation 2\", \"Laboratoire de langage de programmation 2\", \"Structures de données et algorithme\",\n" +
            "    \"Laboratoire Structures de Données et Algorithmes\", \"Conception de Logique Numérique\", \"Laboratoire de Conception de Logique Numérique\",\"Conception junior\", \"Organisation et architecture informatique\", \"Systèmes de bases de données\", \"Laboratoire de systèmes de bases de données\",\"Système d'exploitation et conception\", \"Génie logiciel\", \"Conception senior 1\", \"Pré-calculs\", \"Calculs 1\",\" Algèbre linéaire\", \"Calculs 2\", \"Calculs 3\", \"Mathématiques de l'ingénieur\", \"Probabilités et statistiques\",\n" +
            "    \" Physique 1\", \"Physique 1 Lab\", \"Chimie 1\", \"Chimie 1 Lab\", \"Biologie 1\", \"Biologie 1 Lab\", \"Anglais\",\n" +
            "    \"Introduction à la composition\", \"Composition intermédiaire\", \"Prise de parole en public\", \"Électronique analogique 1\",\n" +
            "    \" Laboratoire d'électronique analogique 1\", \"Circuit électronique 1\", \"Laboratoire de circuit électronique 1\", \"Dessin d'ingénierie\",\n" +
            "    \" Économie de l'ingénierie\" ,  \"Sciences politiques\" ,  \"Introduction à la microéconomie\", \n"};

    private final  String[] credit = {"3", "1", "3", "3", "1", "3", "0", "3", "0", "1", "3", "3", "0", "3", "3",
        "7.5", "0", "3", "3", "3", "3", "3", "3", "3", "1", "3", "1", "3", "1", "3", "3", "3", "3", "3", "1",
        "3", "1", "1", "3", "3", "3"};
    private final String[] col = {"#", "Cours", "Credits", "Intitulé des cours", "Priorité", "Horaire et jour"};
    private final String[] row = new String[6];

    Preadmission() {
        super("Preadmission");
        preadmission();
    }

    @SuppressWarnings("empty-statement")
    private void preadmission() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 1400, 740);

        img1 = new ImageIcon(getClass().getResource("deleted.png")); //Add to JFrame logo image
        img2 = new ImageIcon(getClass().getResource("course.png"));
        this.setIconImage(img2.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Times New Roman", Font.BOLD, 20);
        font = new Font("Times New Roman", Font.BOLD, 22);

        courseLabel = new JLabel("Course:");
        courseLabel.setFont(font);
        courseLabel.setBounds(20, 100, 100, 50);
        c.add(courseLabel);

        cmbx1 = new JComboBox(coursesList);
        cmbx1.setFont(f);
        cmbx1.setSelectedItem("CSE225");
        cmbx1.setBounds(120, 100, 250, 50);
        cmbx1.setEditable(true);//editable to combo box
        c.add(cmbx1);

        priorityLabel = new JLabel("Priority:");
        priorityLabel.setFont(font);
        priorityLabel.setBounds(390, 100, 100, 50);
        c.add(priorityLabel);

        cmbx2 = new JComboBox(priorityList);
        cmbx2.setFont(f);
        cmbx2.setSelectedItem("1");
        cmbx2.setBounds(510, 100, 250, 50);
        cmbx2.setEditable(true);//editable to combo box
        c.add(cmbx2);

        addButton = new JButton("Add");
        addButton.setFont(f);
        addButton.setBackground(Color.GREEN);
        addButton.setBounds(780, 100, 120, 50);
        c.add(addButton);

        choosenLabel = new JLabel("Your choosen courses:");
        choosenLabel.setFont(font);
        choosenLabel.setBounds(20, 170, 300, 40);
        c.add(choosenLabel);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setFont(f);
        table.setDefaultEditor(Object.class, null);//now table not editable
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(35);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(460);
        table.getColumnModel().getColumn(4).setPreferredWidth(130);
        table.getColumnModel().getColumn(5).setPreferredWidth(375);

        //change to table header font and color
        header = table.getTableHeader();
        header.setFont(new Font("Times New Roman", Font.BOLD, 18));
        header.setForeground(Color.ORANGE);
        header.setBackground(Color.BLUE);

        scroll = new JScrollPane(table);
        scroll.setFont(f);
        scroll.setBounds(14, 220, 1340, 370);
        c.add(scroll);

        deleteButton = new JButton(img1);
        deleteButton.setBackground(Color.MAGENTA);
        deleteButton.setBounds(1260, 610, img1.getIconWidth(), img1.getIconHeight());
        c.add(deleteButton);

        backButton = new JButton("Back");
        backButton.setFont(f);
        backButton.setBackground(Color.GREEN);;
        backButton.setBounds(20, 620, 120, 50);
        c.add(backButton);

        saveButton = new JButton("Save");
        saveButton.setFont(f);
        saveButton.setBackground(Color.GREEN);;
        saveButton.setBounds(580, 620, 120, 50);
        c.add(saveButton);

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        backButton.addActionListener(this);
        saveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            if (table.getRowCount() == 8) {
                JOptionPane.showMessageDialog(null, "Vous avez ete absent aux cours");
            } else {
                int count = table.getRowCount() + 1;
                String total = String.valueOf(count);
                row[0] = total;
                row[1] = cmbx1.getSelectedItem().toString();
                for (int i = 0; i < coursesList.length; i++) {
                    if (cmbx1.getSelectedItem().toString() == coursesList[i]) {
                        row[2] = credit[i];
                        row[3] = courseName[i];

                    }
                }
                row[4] = cmbx2.getSelectedItem().toString();
                date = new Date();
                row[5] = date.toString();
                model.addRow(row);
            }

        } else if (e.getSource() == backButton) {
            dispose();
            Semestre s = new Semestre();
            s.setVisible(true);
        } else if (e.getSource() == deleteButton) {
            int numberOfRow = table.getSelectedRow();
            if (numberOfRow >= 0) {
                model.removeRow(numberOfRow);
            } else {
                JOptionPane.showMessageDialog(null, "Aucune ligne n'a été sélectionnée");
            }
        } else if (e.getSource() == saveButton) {
            try {
                File fp = new File("Preadmission.txt");//crée le fichier
                if (!fp.exists()) {
                    fp.createNewFile();
                }

                try (FileWriter fw = new FileWriter(fp.getAbsoluteFile()); 
               BufferedWriter bw = new BufferedWriter(fw)) {
                    
                    for (int i = 0; i < table.getRowCount(); i++) {
                        for (int j = 0; j < table.getColumnCount(); j++) {
                            bw.write(table.getModel().getValueAt(i, j) + " ");
                        }
                        bw.write("\r\n");
                        bw.write("\r\n");
                        
                    }
                }
                JOptionPane.showMessageDialog(null, "Données enregistrées avec succès");

            } catch (HeadlessException | IOException ex) {
                JOptionPane.showMessageDialog(null, "Quitter");
            }
        }
    }
    public static void main(String[] args) {
        Preadmission pre = new Preadmission();
        pre.setVisible(true);
    }
}
