import java.util.Random;
import java.util.Scanner;
public class Craps{
    //criando gerador de numeros aleatorios
    private static final Random randomNumber=new Random();
    private static final Scanner input=new Scanner(System.in);
    //enumeracao com constantes
    private enum Status{CONTINUE,WON,LOST};
    //variavel de aposta
    private int bankBalance=1000;
    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES=2;
    private static final int TREY=3;
    private static final int BOX_CARS=12;
    private static final int SEVEN=7; 
    private static final int YO_Leven=11;
    //joga uma partida de Craps
    public void play(){
        int myPoint=0;//pontos se não ganhar ou perder na primeira rodada
        Status gameStatus;//pode conter continue,won ou lost
        boolean primeiravez=false;
        while(this.bankBalance>0)
        {
            int aposta=2000;
            if(primeiravez==false){
                System.out.println("Bem vindo ao mundo Craps,seu saldo ao entrar no cassino!!!");
                System.out.println("Aposte -1 para sair");
                primeiravez=true;
            }
            System.out.printf("\nSeu saldo agora= %d\n",this.bankBalance);
            while(aposta>this.bankBalance){
                System.out.print("Quanto voce vai apostar :");
                aposta=input.nextInt();
                if(aposta>this.bankBalance){
                    System.out.printf("\nVoce nao tem esse dinheiro todo\nFaca uma aposta menor!!\n");
                }
                if(aposta<=0){
                    System.out.printf("\nObrigado por jogar volte sempre!!!\n");
                    break;
                }
            }
            if(aposta<=0){
                break;
            }
            int sumOfDice=rolarDados();//primeira rolagem dos dados
            switch(sumOfDice)
            {
                case SEVEN://ganha com 7 no primeiro lançamento
                case YO_Leven://ganha com 11 no primeiro lançamento
                    gameStatus=Status.WON;
                    exibiMensagens();
                    System.out.printf("\nParabens!!Voce ganhou dessa vez!!\nForam adicionados %d em sua conta",aposta);
                    bankBalance+=aposta;
                    break;
                case SNAKE_EYES://perde com 2 no primeiro lançamento
                case TREY://perde com 3 no primeiro lançamento
                case BOX_CARS://perde com 12 no primeiro lançamento
                    gameStatus=Status.LOST;
                    System.out.printf("\nVoce Perdeu :( !!Foi debitado %d em sua conta",aposta);
                    exibiMensagens();
                    bankBalance-=aposta;
                    break;
                default://não ganhou nem perdeu então registra a pontuação
                    gameStatus=Status.CONTINUE;//jogo não termina
                    myPoint=sumOfDice;//informa a pontuacao
                    System.out.printf("Point is %d\n",myPoint);
                    //enquanto o jogo não está completo
                    while(gameStatus==Status.CONTINUE){
                        sumOfDice=rolarDados();//lança os dados novamente
                        //determina o status do game
                        if(sumOfDice==myPoint){//ganha se acertar a pontuação
                            gameStatus=Status.WON;
                            System.out.printf("\nParabens!!Voce ganhou dessa vez!!\nForam adicionados %d em sua conta\n",aposta);
                            exibiMensagens();
                            bankBalance+=aposta;
                        }
                        else
                        {
                            if(sumOfDice==SEVEN)
                            {//perde obtendo sete
                                gameStatus=Status.LOST;
                                System.out.printf("\nVoce Perdeu :( !!Foi debitado %d em sua conta\n",aposta);
                                exibiMensagens();
                                bankBalance-=aposta;
                            }
                        }
                    }
                    break;
            }
        }
         //exibe uma mensagem se ganhou ou perdeu
        if(this.bankBalance<=0)
            System.out.println("Voce faliu, mais sorte na proxima vez");
        else
            System.out.printf("\nParabens!!\nA sorte te sorriu!!\nSeu saldo apos esse dia divertido de apostas = %d",this.bankBalance);
    }
    //metodo que rola os dados
    public int rolarDados(){
        //seleciona os valores aleatórios dos dados
        int die1=1+randomNumber.nextInt(6);
        int die2=1+randomNumber.nextInt(6);
        int sum=die1+die2;
        //exibe os detalhes do lançamento
        System.out.printf("Player rolled %d + %d =%d\n",die1,die2,sum);
        return sum;//retorna a soma
    }
    //metodo que exibe mensagens aleatorias
    private void exibiMensagens(){
        int rd=randomNumber.nextInt(3);
        if(rd==0)
            System.out.println("Xi,parece que voce vai quebrar hein!");
        else if(rd==1)
            System.out.println("Ei,vamos la,de uma chance para sua sorte!");
        else if(rd==2)
            System.out.println("Voce esta montado na grana. Ta na hora de trocar essas fichas e embolsar o dinheiro!!");

    }
}