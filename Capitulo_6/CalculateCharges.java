import java.util.Random;
public class CalculateCharges{
    private static final Random randomNumber=new Random();
    private static final double taxa_minima=2.00;
    private static final double taxa_adicional=2.50;
    private int quantidade;
    public void playEstacionamento(){
        int horas;
        double somaTotal=0;
        int somaHora=0;
        for(int i=1;i<=this.quantidade;i++){
            double taxaTotal=0.00;
            horas=Clientes();
            int horas_total=horas;
            if(horas<=3)
                taxaTotal=taxa_minima;
            if(horas>3){
                horas-=3;
                taxaTotal=taxa_minima+(taxa_adicional*horas);
                if (taxaTotal>=10.00)
                    taxaTotal=10.00;
            }
            somaTotal+=taxaTotal;
            somaHora+=horas_total;
            System.out.printf("\nCliente:%d\nHoras estacionado:%d\nTaxa Total a pagar:%.2f\n\n\n",i,horas_total,taxaTotal);
        }
        System.out.printf("\nTotal de Clientes:%d\nHoras soma cliente:%d\nRendimento total:%.2f\n\n\n",this.quantidade,somaHora,somaTotal);
    }
    //metodos set
    public void setQuantidade(int qtd){
        this.quantidade=qtd;
    }
    //metodo gerador de hora
    private int Clientes(){
        int hora_estacionado=1+randomNumber.nextInt(24);
        return hora_estacionado;  
    }
}