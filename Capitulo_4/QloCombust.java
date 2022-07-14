import java.util.Scanner;
public class QloCombust{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int km=0,lc=0,soma1=0,soma2=0,c=0;
        double calc1,calc2;
        while(c!=-1){
            System.out.print("Digite -1 para sair :");
            c = input.nextInt();
            if(c==-1)
                break;
            System.out.print("Digite a quantidade de litros consumidos :");
            lc = input.nextInt();
            System.out.print("Digite a quilometragem rodada :");
            km = input.nextInt();
            calc1 = km/lc;
            soma1+=lc;
            soma2+=km;
            System.out.printf("\nQuilometragem por litro = %.2f\n",calc1);
        }
        System.out.printf("\nA quantidade de litros somados no total: %d\n",soma1);
        System.out.printf("\nA Quilometragem somada no total = %d\n",soma2);
    }
}