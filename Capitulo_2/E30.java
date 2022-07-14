import java.util.Scanner;
public class E30{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int div,mod;
        System.out.printf("Digite um numero :");
        n1 = input.nextInt();
        div = n1 / 1000;
        mod = n1 - (div * 1000);
        System.out.printf("\n O numero :");
        System.out.printf("%d ",div);
        div = mod /100;
        mod = mod - (div*100);
        System.out.printf("%d ",div);
        div = mod /10;
        mod = mod - (div*10);
        System.out.printf("%d ",div);
        div = mod /1;
        mod = mod - (div*1);
        System.out.printf("%d ",div);
    }
}