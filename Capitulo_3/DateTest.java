import javax.swing.JOptionPane;
public class DateTest{
    public static void main(String [] args){
        Date data1 = new Date(07,04,2022);
        Date data2 = new Date(00,00,00);
        //exibindo mensagem
        JOptionPane.showMessageDialog(null,data1.displayDate());
        //setando data
        String msg1 = JOptionPane.showInputDialog("Dia :");
        int aux = Integer.parseInt(msg1);
        data2.setDay(aux);
        msg1 = JOptionPane.showInputDialog("Mes :");
        aux = Integer.parseInt(msg1);
        data2.setMonth(aux);
        msg1 = JOptionPane.showInputDialog("Ano :");
        aux = Integer.parseInt(msg1);
        data2.setYear(aux);
        //exibindo mensagem
        JOptionPane.showMessageDialog(null,data2.displayDate());

    }
}