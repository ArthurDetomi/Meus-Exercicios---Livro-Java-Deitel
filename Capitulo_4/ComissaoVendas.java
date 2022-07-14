import javax.swing.JOptionPane;
public class ComissaoVendas{
    public static void main(String[] args){
        String msg,msg2;
        int qtd, op;
        double soma=0.0;
        while(true){
            msg =String.format("\nCalculador de comissao:\nItens Vendidos\nescolha (1) (2) (3) (4) ((-1) Para sair):\n");
            msg2 = JOptionPane.showInputDialog(msg);
            op = Integer.parseInt(msg2);
            if(op==-1)
                break;
            msg = JOptionPane.showInputDialog("Digite a quantidade vendidade desse item :");
            qtd = Integer.parseInt(msg);
            switch(op){
                case 1:
                    soma += 200 + ((qtd * 239.99) * 0.09);
                    break;
                case 2:
                    soma += 200 + ((qtd * 129.75) * 0.09);
                    break;
                case 3:
                    soma += 200 + ((qtd * 99.95) * 0.09);
                    break;
                case 4:
                    soma += 200 + ((qtd * 350.89) * 0.09);
                    break;
            }
        }
            msg = String.format("\nSeu rendimento total foi de: %.2f\n",soma);
            JOptionPane.showMessageDialog(null,msg);
    }
}