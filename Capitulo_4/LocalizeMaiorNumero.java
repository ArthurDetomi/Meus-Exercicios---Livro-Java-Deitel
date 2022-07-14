import java.util.Scanner;
public class LocalizeMaiorNumero{
    public static void main (String[] args){
        int numero, maior=0,segundomaior=0;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Digite um numero :");
            numero = input.nextInt();
            if(i==0){
                maior = numero;
                segundomaior = numero;
            }if(numero>maior)
                maior = numero;
            if(numero<maior && numero>segundomaior)
                segundomaior=numero;
        }
        System.out.printf("\nO maior numero digitado foi : %d\n",maior);
        System.out.printf("\nO segundo maior numero digitado foi: %d",segundomaior);
    }
}