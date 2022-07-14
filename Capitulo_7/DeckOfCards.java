import java.util.Random;
public class DeckOfCards{
    private Card[] deck;//array de objetos card
    private int currentCard;//indice do proximo card a ser distribuido
    private static final int NUMBER_OF_CARDS=52;//numero de constantes de card
    //gerador de numeros aleatorios
    private static final Random randomNumber=new Random();
    //construtor preenche baralho de cartas
    public DeckOfCards(){
        String [] faces={"As","Dois","Tres","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Rainha","Rei"};
        String [] suits={"Coracao","Ouro","Paus","Espada"};

        deck=new Card[NUMBER_OF_CARDS];//cria array de objetos card
        currentCard=0;//configura currentCard então o primeiro card distribuido é o deck[0]
        //preenche o baralho com objetos Card
        for(int i=0;i<deck.length;i++){
            deck[i]=new Card(faces[i%13],suits[i/13]);
        }
    }
    //embaralha as cartas com um algoritmo de passagem
    public void shuffle(){
        //depois de embaralhar, a distribuição deve-se iniciar em deck[0] novamente
        currentCard=0;//reinicializa current card
        //para cada card seleciona outro card aleatorio e os compara
        for(int first=0;first<deck.length;first++){
            //seleciona um numero aleatorio entre 0 e 51
            int second=randomNumber.nextInt(NUMBER_OF_CARDS);
            //compara card atual com card aleatoriamente selecionado
            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    //distribui um card
    public Card dealCard(){
        //determina se ainda há cards a serem distribuidos
        if(currentCard<deck.length)
            return deck[currentCard++];//retorna card atual no array
        else
            return null;//retorna nulo para indicar que os cards foram distribuidos
    }
}