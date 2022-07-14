import java.util.Random;
import java.util.Scanner;
public class AuxiliaMulti{
    private static final Random randomNumber=new Random();
    private static final Scanner input=new Scanner(System.in);
    private int operador1;
    private int operador2;
    private int resposta;
    private int tipodeop;
    public void playAssistencia(){
        int respostauser;
        int cont=0;
        int acertos=0;
        int erros=0;
        System.out.println("Bem vindo!!Pronto para treinar multiplicacao!!");
        int dificuldade= getescolhaDificuldade();
        System.out.print("Digite a operacao que voce deseja:\n(1)adicao(2)subtracao(3)multiplicao(4)aleatorio\nQual a sua escolha :");
        this.tipodeop=input.nextInt();
        for(int i=0;i<10;i++){
            if(cont==0)
                geradorContas(0,dificuldade);
            else    
                geradorContas(1,dificuldade);
            respostauser=input.nextInt();
            if(this.resposta==respostauser){
                System.out.println(getmensagemAcertos());
                cont=0;
                acertos++;
            }
            else if(this.resposta!=respostauser){
                System.out.println(getmensagemErros());
                cont++;
                i--;
                erros++;
            }
            if(i==9){
                System.out.println(getDesempenho(acertos,erros));
                cont=0;
            }
        }
        System.out.println("Fim.... Obrigado, voce eh muito inteligente!!!");
    }
    //metodos set
    private void setOperadorUm(int dificuldade){
        if(dificuldade==1)
            this.operador1=1+randomNumber.nextInt(10);
        else if(dificuldade==2)
            this.operador1=1+randomNumber.nextInt(100);
    }
    private void setOperadorDois(int dificuldade){
        if(dificuldade==1)
            this.operador2=1+randomNumber.nextInt(10);
        if(dificuldade==2)
            this.operador2=1+randomNumber.nextInt(100);
    }
    //metodos get
    private int getOperadorUm(){
        return this.operador1;
    }
    private int getOperadorDois(){
        return this.operador2;
    }
    private String getmensagemAcertos(){
        int num=randomNumber.nextInt(4);
        if(num==0)
            return "Parabens!!!";
        if(num==1)
            return "Excelente!!!";
        if(num==2)
            return "Bom trabalho!!!";
        if(num==3)
            return "Continue trabalhando bem assim!!!";
        return "Falha";
    }
    private String getmensagemErros(){
        int num=randomNumber.nextInt(4);
        String msg;
        if(num==0)
            return "Nao.tente de novo";
        if(num==1)
            return "Errado.Tente mais uma vez";
        if(num==2)
            return "Nao desista!";
        if(num==3)
            return "Nao. continue tentando";
        return "Falha";
    }
    private String getDesempenho(int acertos,int erros){
        double percentual_minimo=10*0.75;
        if(acertos>=percentual_minimo)
            return "Parabens!! Voce esta pronto para passar para o proximo nivel!!";
        else if(acertos<=percentual_minimo)
            return "Peca ajuda extra ao seu professor";
        return "Erro";
    }
    private int getescolhaDificuldade(){
        System.out.print("Digite o nivel de dificuldade:\n(1)facil(2)dificil");
        int escolha=input.nextInt();
        return escolha;
    }
    //metodos gerador de contas 
    private void geradorContas(int val,int dificult){
        int aux;
        if(this.tipodeop==4)
            aux=1+randomNumber.nextInt(3);
        else    
            aux=this.tipodeop;
        if(val==0 && dificult==1){
            setOperadorUm(1);
            setOperadorDois(1);
        }
        if(val==0 && dificult==2){
            setOperadorUm(2);
            setOperadorDois(2);
        }
        int a=getOperadorUm();
        int b=getOperadorDois();
        switch(aux){
            case 1:
                System.out.printf("\nQuanto eh?\n%d + %d =",getOperadorUm(),getOperadorDois());
                this.resposta=getOperadorDois()+getOperadorUm();
                break;
            case 2:
                System.out.printf("\nQuanto eh?\n%d - %d =",getOperadorUm(),getOperadorDois());
                this.resposta=getOperadorUm()-getOperadorDois();
                break;
            case 3:
                System.out.printf("\nQuanto eh?\n%d x %d =",getOperadorUm(),getOperadorDois());
                this.resposta=getOperadorDois()*getOperadorUm();
                break;
            default:
                System.out.printf("\nErro grave\n");
                break;
        } 
    }
}