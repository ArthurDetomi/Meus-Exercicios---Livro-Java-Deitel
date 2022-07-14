import java.util.Scanner;
public class Palindromo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=1,u,c,d,m1,m2,mod;
        int op;
        while(true){
            while(n<10000 && n<=99999){
                System.out.print("Digite um numero :");
                n=input.nextInt();
            }
            m1=n/10000;
            mod=n%10000;
            m2=mod/1000;
            mod%=1000;
            c=mod/100;
            mod%=100;
            d=mod/10;
            mod%=10;
            u=mod;
            int novo_numero=(u*10000)+(d*1000)+(c*100)+(m2*10)+m1;
            if(n==novo_numero)
                System.out.printf("\nO numero = %d é palindromo\n",n);
            else
                System.out.printf("\nO numero =%d NAO EH palindromo\n",n);
            System.out.print("Deseja sair (se digitar 1 sim)(qualquer outro nao):");
            op=input.nextInt();
            if(op==1){
                System.out.println("Obrigado por utilizar o programa\nFIM..");
                break;
            }
            n=1;
        }
    }
}