import java.awt.Graphics;
import javax.swing.JPanel;
public class Shapes extends JPanel{
    private int choice;//escolha do usuário
    //construtor configura a escolha do usuário
    public Shapes(int userChoice){
        this.choice=userChoice;
    }//fim do construtor
    //desenha uma cascata de formas que se iniciam do canto superior esquerdo
    public void paintComponent(Graphics g){
        for(int i=0;i<10;i++){
            switch(this.choice){
                case 1://desenha retangulos
                    g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
                    break;
                case 2://desenha elipses
                    //baixo,direita,largura e altura
                    g.drawOval(200,150,50+i*10,50+i*10);
                    //g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
                    break;
            }//fim do switch
        }//fim do for
    }//fim do metodo paintComponent
}//fim da classe Shapes