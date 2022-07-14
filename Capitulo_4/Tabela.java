public class Tabela{
    public static void main (String [] args){
        for(int i=1;i<=5;i++){
            System.out.printf("\n%d   %d    %d   %d\n",i,i*10,i*100,i*1000);
        }
        int cont=1;
        System.out.println("Utilizando While");
        while(cont<=5){
            System.out.printf("\n%d   %d    %d   %d\n",cont,cont*10,cont*100,cont*1000);
            cont++;
        }
    }
}