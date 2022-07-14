import javax.swing.JFrame;
public class DrawAlvoTest{
    public static void main(String[] args){
        DrawAlvo panel=new DrawAlvo();
        JFrame application=new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
    }
}