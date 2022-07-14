import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest{
    public static void main(String[] args){
        //obtem a escolha do usuario
        String input=JOptionPane.showInputDialog("Digite 1 para desenhar retangulos\n"+"Digite 2 para desenhar circulos:");
        int choice=Integer.parseInt(input);//converte a entrada para int
        //cria o painel com a entrada do usuário
        Shapes panel=new Shapes(choice);
        //cria um novo JFrame
        JFrame application=new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//faz finalizar ao fechar 
        application.add(panel);//adiciona o painel
        application.setSize(300,300);//configura o tamanho desejado
        application.setVisible(true);//mostra o frame
    }//fim metodo main
}//fim da classe ShapeTest
