public class DeckOfCardsTest{
    public static void main(String[] args){
        DeckOfCards myDeckOfCards=new DeckOfCards();
        myDeckOfCards.shuffle();//Coloca os cards em ordem aleatoria
        //imprime todas as 52 cartas na ordem que foram distribuidas
        for(int i=0;i<52;i++){
            //distribui e exibe uma carta
            System.out.printf("%-19s",myDeckOfCards.dealCard());
            if(i%4==0)//imprime uma linha a cada quatro cartas
                System.out.println();
        }
         System.out.println();
    }
}