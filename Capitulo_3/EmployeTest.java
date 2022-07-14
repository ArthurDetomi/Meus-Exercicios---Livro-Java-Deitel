import javax.swing.JOptionPane;
public class EmployeTest{
    public static void main (String[] args){
        Employe empregado1 = new Employe("Evaristo","Costa",1250.90);
        Employe empregado2 = new Employe("null","null",-1.2);
        //exibindo mensagem
        String msg1 = String.format("\nEmpregado 1\nNome: %s %s\nSalario : %.2f\nSalario com aumento : %.2f",empregado1.getName(),empregado1.getlastName(),empregado1.getSalario(),empregado1.getAumentoSal());
        JOptionPane.showMessageDialog(null,msg1);
        //setando valores
        msg1 = JOptionPane.showInputDialog("Nome :");
        empregado2.setName(msg1);
        msg1 = JOptionPane.showInputDialog("Sobrenome :");
        empregado2.setlastName(msg1);
        msg1 = JOptionPane.showInputDialog("Salario :");
        double  sal= Double.parseDouble(msg1);
        empregado2.setSalario(sal);
         //exibindo mensagem
        msg1 = String.format("\nEmpregado 2\nNome: %s %s\nSalario : %.2f\nSalario com aumento : %.2f",empregado2.getName(),empregado2.getlastName(),empregado2.getSalario(),empregado2.getAumentoSal());
        JOptionPane.showMessageDialog(null,msg1);
    }   
}