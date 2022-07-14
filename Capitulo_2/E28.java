import java.util.Scanner;
public class E28{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int r;
        System.out.print("Digite o raio do circulo:");
        r = input.nextInt();
        System.out.printf("\nA area do circulo : %f cm²\nO diametro do circulo: %d cm\nO comprimento do circulo : %f cm\n", Math.PI*(r*r), 2*r, 2*Math.PI*r);
    }
}