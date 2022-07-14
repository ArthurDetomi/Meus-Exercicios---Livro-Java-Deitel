import java.util.Scanner;
public class E24{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);  
        int n1=0, n2=0, n3=0, n4=0, n5=0;
        int maior, menor;
        System.out.print("Digite um numero :");
        n1 = input.nextInt();
        maior = n1;
        menor=n1;

        System.out.print("Digite um numero :");
        n2 = input.nextInt();
        if(n2>maior)
            maior = n2;
        if(n2<menor)
            menor =n2;

        System.out.print("Digite um numero :");
        n3 = input.nextInt();
        if(n3>maior)
            maior = n3;
        if(n3<menor)
            menor =n3;

        System.out.print("Digite um numero :");
        n4 = input.nextInt();
        if(n4>maior)
            maior = n4;
        if(n4<menor)
            menor =n4;

        System.out.print("Digite um numero :");
        n5 = input.nextInt();
        if(n5>maior)
            maior = n5;
        if(n5<menor)
            menor =n5;
        
        System.out.printf("\nO maior numero : %d\nO menor numero: %d\n", maior, menor);
        
    }
}