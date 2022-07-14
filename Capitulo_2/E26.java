import java.util.Scanner;
public class E26{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Digite um numero :");
        n1 = input.nextInt();
        System.out.print("Digite um numero :");
        n2 = input.nextInt();
        if(n1>n2){
            if(n1%n2==0)
                System.out.printf("\n %d eh multiplo de %d \n", n1, n2);
            else
                System.out.printf("\n %d Nao eh multiplo de %d \n", n1, n2);
        }else{
            if(n2%n1==0)
                System.out.printf("\n %d eh multiplo de %d \n", n2, n1);
            else
                System.out.printf("\n %d Nao eh multiplo de %d \n", n2, n1);
        }

    }
}