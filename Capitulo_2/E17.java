import java.util.Scanner;
public class E17{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n1=0;
        int n2=0;
        int n3=0;
        int soma=0;
        System.out.print("Digite um numero :");
        n1 = input.nextInt();
        System.out.print("Digite um numero:");
        n2 = input.nextInt();
        System.out.print("Digite um numero:");
        n3 = input.nextInt();
        soma=n1+n2+n3;
        System.out.printf("\nA soma: %d\nO produto: %d\nA media: %d", soma, n1*n2*n3, soma/3);
        System.out.printf("\nEm ordem crescente :");
        if(n1>n2 && n1>n3 && n3>n2){
            System.out.printf("%d,%d,%d",n2,n3,n1);
        }
        if(n1>n2 && n1>n3 && n2>n3){
            System.out.printf("%d,%d,%d",n3,n2,n1);
        }
        if(n2>n1 && n2>n3 && n1>n3){
            System.out.printf("%d,%d,%d",n3,n1,n2);
        }
        if(n2>n1 && n2>n3 && n3>n1){
            System.out.printf("%d,%d,%d",n1,n3,n2);
        }
        if(n3>n1 && n3>n2 && n1>n2){
            System.out.printf("%d,%d,%d",n2,n1,n3);
        }
        if(n3>n1 && n3>n2 && n2>n1){
            System.out.printf("%d,%d,%d",n1,n2,n3);
        }
    }
}