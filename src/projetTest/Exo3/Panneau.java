package projetTest.Exo3;

import java.awt.Graphics;
import javax.swing.JPanel;
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
        System.out.println("Coucou !");
        g.fillOval(20, 20, 75, 75);
        //int x1 = this.getWidth()/4;
        //int y1 = this.getHeight()/4;
        //g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
        g.drawRect(10, 10, 50, 60);
        g.fillRect(65, 65, 30, 40);
    }
}