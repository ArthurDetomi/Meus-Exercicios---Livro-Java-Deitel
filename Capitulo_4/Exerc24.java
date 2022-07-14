import java.util.Scanner;
public class Exerc24{
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int n=0;
        while(n<1 || n>2){
            System.out.print("Digite um numero :");
            n=input.nextInt();
        }
    }
}