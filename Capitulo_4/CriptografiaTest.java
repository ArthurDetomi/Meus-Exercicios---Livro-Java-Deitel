import javax.swing.JOptionPane;
public class CriptografiaTest{
    public static void main(String[] args){
        int n=1,n_cripto,n_descri;
        int m,c,d,u,mod;
        Criptografia objeto1=new Criptografia(5);
        String msg;
        while(true){
            while(n<1000){
                msg=JOptionPane.showInputDialog("Digite um numero de 4 digitos para criptografa-lo:");
                n=Integer.parseInt(msg);
                if(n<1000 && n>9999)
                    JOptionPane.showMessageDialog(null,"Digitou um valor invalido\nTente novamente..");
            }
            m=n/1000;
            mod=n%1000;
            c=mod/100;
            mod%=100;
            d=mod/10;
            mod%=10;
            u=mod;
            m=(m+7)%10;
            c=(c+7)%10;
            d=(d+7)%10;
            u=(u+7)%10;
            n_cripto=(d*1000)+(u*100)+(m*10)+c;
            msg=String.format("O numero criptografado = %d",n_cripto);
            objeto1.SetNumber(n_cripto);
            JOptionPane.showMessageDialog(null,msg);
            JOptionPane.showMessageDialog(null,"Descriptografando...");
            n_descri=objeto1.Descripto();
            msg=String.format("O numero descriptografado = %d",n_descri);
            JOptionPane.showMessageDialog(null,msg);
            msg=JOptionPane.showInputDialog("Deseja digitar mais numeros(1)sim(2)nao:");
            int op=Integer.parseInt(msg);
            if(op==2){
                JOptionPane.showMessageDialog(null,"Fim do Programa");
                break;
            }
        }
    }
}