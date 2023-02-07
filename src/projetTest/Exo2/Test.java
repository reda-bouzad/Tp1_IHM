package projetTest.Exo2;

import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame{
    MaFenetre (){
        setTitle ("Dessin d’un trait") ;
        setSize (300, 150) ;
        pan = new Paneau() ;
        getContentPane().add(pan) ;
        pan.setBackground(Color.yellow) ;
    }
    private JPanel pan ;}
class Paneau extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g) ;
        g.drawLine (15, 10, 100, 50) ;
    }}
public class Test{
    public static void main (String args[]){
        MaFenetre fen = new MaFenetre();
        fen.setVisible(true);
    }
}