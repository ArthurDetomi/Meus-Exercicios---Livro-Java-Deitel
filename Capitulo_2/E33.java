import java.util.Scanner;
public class E33{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double h;
        double p;
        System.out.print("Digite sua altura :");
        h = input.nextDouble();
        System.out.print("Digite seu peso :");
        p = input.nextDouble();
        double imc = p / (h*h);
        if(imc<=18.5)
            System.out.printf("\nAbaixo do peso\nImc: %f\n",imc);
        if(imc>18.5 && imc<=24.9)
            System.out.printf("\nPeso Normal\nImc : %f\n",imc);
        if(imc>24.9 && imc<=29.9)
            System.out.printf("\nSobrepeso\nImc : %f\n",imc);
        if(imc>=30)
            System.out.printf("\nObeso\nImc : %f\n",imc);
    }
}