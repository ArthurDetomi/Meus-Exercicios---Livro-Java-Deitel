import java.util.Scanner;
public class ComissaoTest{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Comissao objeto=new Comissao();
        System.out.print("Digite a quantidade de funcionarios:");
        int qtd=input.nextInt();
        objeto.setTotalFuncionario(qtd);
        for(int i=0;i<qtd;i++){
            objeto.getSaudacao(i);
            System.out.print("Informe seu rendimento bruto Semanal :");
            int rendBruto=input.nextInt();
            int comissao=objeto.comissaoCalculo(i,rendBruto);
            System.out.printf("\nSua Comissao foi de %d\n",comissao);
        }
        objeto.getArray();
    }
}