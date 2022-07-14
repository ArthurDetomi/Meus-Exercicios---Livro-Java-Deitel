public class Card{
    private String face;//face da carta
    private String suit;//naipe da carta
    //construto de dois argumentos
    public Card(String cardFace,String cardSuit){
        face=cardFace;
        suit=cardSuit;
    }
    //retorna a representação String de Card
    public String toString(){
        return face+" de "+suit;
    }
}