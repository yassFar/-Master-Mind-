package GUI;

import java.awt.GridLayout; 

import javax.swing.JButton;

import javax.swing.JFrame;


 

public class Fenetre extends JFrame
{
  public Fenetre()
  {

    this.setTitle("Bouton");

    this.setSize(900, 100);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    //On définit le layout à utiliser sur le content pane

    //Trois lignes sur deux colonnes

    this.setLayout(new GridLayout(1, 4));

    //On ajoute le bouton au content pane de la JFrame

    this.getContentPane().add(new Bouton("1"));

    this.getContentPane().add(new Bouton("2"));

    this.getContentPane().add(new Bouton("3"));

    this.getContentPane().add(new Bouton("4"));

    this.setVisible(true);

  }
}