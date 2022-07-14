import java.util.Scanner;
public class E25{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n1;        
        System.out.print("\nDigite um numero :");
        n1 = input.nextInt();
        if(n1%2==0)
            System.out.println("Esse numero eh par");
        else
            System.out.println("Esse numero eh impar");

    }
}