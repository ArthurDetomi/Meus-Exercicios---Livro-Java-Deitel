import java.util.Scanner;
public class CalculateChargesTest{
    public static void main(String[] args){
       CalculateCharges play=new CalculateCharges();
       Scanner input=new Scanner(System.in);
       //quantidade de clientes
       System.out.print("Digite quantos clientes tiveram ontem :");
       int quantidade=input.nextInt();
       play.setQuantidade(quantidade);
       play.playEstacionamento();
    }
}