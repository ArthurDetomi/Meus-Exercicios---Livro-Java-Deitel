import javax.swing.JOptionPane;
public class InvoiceTest{
    public static void main(String [] args){
        //criando objeto
        Invoice camiseta = new Invoice("238","Camiseta P",10,29.90);        
        Invoice objeto = new Invoice("886","padrao",1,0.0); 
        //mostrando nota fiscal do primeiro produto passado por parametro
        String msg1 = String.format("id do produto : %s\nDescricao do Produto : %s\nPreco do produto: %.2f\nQtd comprada : %d\nPreco total :%.2f",camiseta.getNumber(),camiseta.getDescription(),camiseta.getPrice(),camiseta.getQuantd(),camiseta.getInvoiceAmount());
        JOptionPane.showMessageDialog(null,msg1);
        //setando valores ao objeto
        msg1 = JOptionPane.showInputDialog("Digite o id do produto :");
        objeto.setNumber(msg1);
        msg1 = JOptionPane.showInputDialog("Digite a descricao do produto :");
        objeto.setDescription(msg1);
        msg1 = JOptionPane.showInputDialog("Digite o preco do produto:");
        double price = Double.parseDouble(msg1);
        objeto.setPrice(price);
        msg1 = JOptionPane.showInputDialog("Digite a quantidade de produto:");
        int qntd = Integer.parseInt(msg1);
        objeto.setQuantd(qntd);
        //mostra nota fiscal do produto setado
        msg1 = String.format("id do produto : %s\nDescricao do Produto : %s\nPreco do produto: %.2f\nQtd comprada : %d\nPreco total :%.2f",objeto.getNumber(),objeto.getDescription(),objeto.getPrice(),objeto.getQuantd(),objeto.getInvoiceAmount());
        JOptionPane.showMessageDialog(null,msg1);
    }
}