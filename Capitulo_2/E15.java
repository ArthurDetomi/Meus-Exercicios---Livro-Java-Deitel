import java.util.Scanner;
public class E15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Digite o valor de a:");
        a = input.nextInt();
        System.out.print("Digite o valor de b:");
        b = input.nextInt();
        System.out.printf("Digite o valor de c:");
        System.out.printf("\nA soma: %d\nA multiplicacao: %d\nA divisao: %d \nO resto : %d\n",a+b,a*b,a/b,a%b);
    }
}