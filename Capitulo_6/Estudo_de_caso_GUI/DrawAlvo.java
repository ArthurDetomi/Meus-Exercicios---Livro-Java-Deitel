import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class DrawAlvo extends JPanel{
    private static final Random randonNumbers=new Random();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //desenha um circulo
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        //desenha um circulo
        g.setColor(Color.BLACK);
        g.fillOval(10,10,100,100);
  
       

    }

}