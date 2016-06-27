package GUI;

import java.awt.GridLayout; 

import javax.swing.JButton;

import javax.swing.JFrame;

import java.util.Map;
import java.util.HashMap;
import java.nio.file.*;
import java.io.File;
 

public class Fenetre extends JFrame
{
  public Fenetre()
  {
    Map<String, Path> imgFiles = new HashMap<String, Path>();
    imgFiles.put("orange",Paths.get("img/orange.png"));
    imgFiles.put("blanc",Paths.get("img/blanc.jpg"));
    imgFiles.put("bleu",Paths.get("img/bleu.png"));
    imgFiles.put("jaune",Paths.get("img/jaune.png"));
    imgFiles.put("rouge",Paths.get("img/rouge.png"));
    imgFiles.put("vert",Paths.get("img/vert.png"));

    this.setTitle("Bouton");

    this.setSize(900, 100);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    //On définit le layout à utiliser sur le content pane

    //Trois lignes sur deux colonnes

    this.setLayout(new GridLayout(1, 4));

    //On ajoute le bouton au content pane de la JFrame
    this.getContentPane().add(new Bouton("orange", imgFiles.get("orange")));

    this.getContentPane().add(new Bouton("rouge", imgFiles.get("rouge")));

    this.getContentPane().add(new Bouton("vert", imgFiles.get("vert")));

    this.getContentPane().add(new Bouton("bleu", imgFiles.get("bleu")));

    this.setVisible(true);

  }
}