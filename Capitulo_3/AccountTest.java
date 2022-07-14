import javax.swing.JOptionPane;
public class AccountTest{
    public static void main (String[] args){
        Account account1 = new Account(50.00);
        Account account2 = new Account(100.00);
        //formatando msg de saldo
        String msg1 = String.format("\nSaldo da conta 1 : %.2f",account1.getBalance());
        String msg2 = String.format("\nSaldo da conta 2 : %.2f",account2.getBalance());
        //mostrar mensagem de saldo
        JOptionPane.showMessageDialog(null,msg1);
        JOptionPane.showMessageDialog(null,msg2);
        //Adicionado valor a conta 1;
        double d1 = 0.0;
        double d2 = 0.0;
        do{
            if(d1<=0){
                String deposit1 = JOptionPane.showInputDialog("Account1 :Digite o Saldo que vc quer depositar a sua conta :");
                d1 = Double.parseDouble(deposit1);
                if(d1<=0)
                    JOptionPane.showMessageDialog(null,"Account1:Nao sao aceitos valores nulos ou negativos");
            }
            if(d2<=0){
                String deposit2 = JOptionPane.showInputDialog("Account2 :Digite o Saldo que vc quer depositar a sua conta :");
                d2 = Double.parseDouble(deposit2);
                if(d2<=0)
                    JOptionPane.showMessageDialog(null,"Account2:Nao sao aceitos valores nulos ou negativos");
            }
        }while(d1<=0 || d2<=0);
        account1.credit(d1);
        account2.credit(d2);
        //formatatando msg de saldo
        msg1 = String.format("\nSaldo da conta 1 : %.2f",account1.getBalance());
        msg2 = String.format("\nSaldo da conta 2 : %.2f",account2.getBalance());
        //mostrar mensagem de saldo
        JOptionPane.showMessageDialog(null,msg1);
        JOptionPane.showMessageDialog(null,msg2);
        //metodo debit
        double dbt1=0.0; 
        double dbt2=0.0;
        do{
            if(dbt1<=0){
                String debit1 = JOptionPane.showInputDialog("Account1 :Digite o valor a debitar na sua conta :");
                dbt1 = Double.parseDouble(debit1);
                if(dbt1<=0)
                    JOptionPane.showMessageDialog(null,"Account1:Nao sao aceitos valores nulos ou negativos");
            }
            if(dbt2<=0){
                String debit2 = JOptionPane.showInputDialog("Account2 :Digite o valor a debitar na sua conta :");
                dbt2 = Double.parseDouble(debit2);
                if(dbt2<=0)
                    JOptionPane.showMessageDialog(null,"Account2:Nao sao aceitos valores nulos ou negativos");
            }
        }while(dbt1<=0|| dbt2<=0);

        JOptionPane.showMessageDialog(null,account1.debito(dbt1));

        
        JOptionPane.showMessageDialog(null,account2.debito(dbt2));


        //formatatando msg de saldo
        msg1 = String.format("\nSaldo da conta 1 : %.2f",account1.getBalance());
        msg2 = String.format("\nSaldo da conta 2 : %.2f",account2.getBalance());
        //mostrar mensagem de saldo
        JOptionPane.showMessageDialog(null,msg1);
        JOptionPane.showMessageDialog(null,msg2);



    }
}