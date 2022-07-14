import java.util.Scanner;
public class Quadrado{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.printf("\nDigite o tamanho dos lados :");
        n=input.nextInt();
        System.out.print("  ");
        for(int i=0;i<n;i++){
            System.out.print("*");
            System.out.print(" ");
        }
        for(int i=0;i<n-1;i++){
            if(i<n-2){
                System.out.print("\n");
                System.out.print("  *");
                for(int j=0;j<n-2;j++){
                    System.out.print("  ");
                }
                System.out.print(" *");
            }
            else{
               System.out.print("\n");
               System.out.print("  ");
               for(int j=0;j<n;j++){
                    System.out.print("*");
                    System.out.print(" ");
               }
            }
        } 
        System.out.print("\n");
    }
}