import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        //chama paintCOmponent para assegurar que o painel seja exibido corretamente
        super.paintComponent(g);
        int width=getWidth();//largura total
        int height=getHeight();//altura total
        //desenha uma linha a partir do canto superior esquerdo até o inferior direito
            //g.drawLine(0,0,width,height);
        //desenha uma linha a partir do canto superior esquerdo até o superior direito
            //g.drawLine(0,height,width,0);
        //testes
        int aux1=width;
        int aux2=height;
        for(int i=0;i<height;i++){
            g.drawLine(i,0,aux1,aux2);
            for(int j=0;j<height;j++){
                g.drawLine(i,0,aux1,aux2);
                aux1/=15;
                aux2/=15;
            }
        }
        //g.drawLine( width, height/2, 0,height/2);
    }
}