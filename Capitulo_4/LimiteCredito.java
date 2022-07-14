import java.util.Scanner;
public class LimiteCredito{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num_conta,saldo_inicial,despesas,credito,limite_credito,c,novo_saldo;
        while(true){
            System.out.print("Digite -1 para sair ou qualquer outro para continuar :");
            c = input.nextInt();
            if(c==-1)
                break;
            System.out.print("Digite o numero da sua conta :");
            num_conta = input.nextInt();
            System.out.print("Digite o saldo do inicio do mes :");
            saldo_inicial = input.nextInt();
            System.out.print("Digite o total de Despesas :");
            despesas = input.nextInt();
            System.out.print("Digite o total de creditos :");
            credito = input.nextInt();
            System.out.print("Digite o limite da sua conta :");
            limite_credito = input.nextInt();
            novo_saldo = saldo_inicial + despesas - credito;
            System.out.printf("\nO novo saldo eh : %d\n",novo_saldo);
            System.out.println(novo_saldo>limite_credito ? "Limite de Credito Excedido": " ");

        }
    }
}