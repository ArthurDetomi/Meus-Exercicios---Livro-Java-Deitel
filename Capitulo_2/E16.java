import java.util.Scanner;
public class E16{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Digite um numero:");
        n1 = input.nextInt();
        System.out.print("Digite um numero:");
        n2 = input.nextInt();
        if(n1>n2)
            System.out.printf("\nn1 eh maior valor: %d\n",n1);
        else
            System.out.printf("\nn2 eh maior valor: %d\n",n2);
        if(n1==n2)
            System.out.println("Os numeros sao iguais"); 
    }//encerra metodo main
}//encerra classe E16