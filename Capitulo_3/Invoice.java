public class Invoice{
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;
    //iniciando construtor com valores 
    public Invoice(String num,String desc,int qtd,double val){
        this.numero = num;
        this.descricao = desc;
        if(qtd>0)
            this.quantidade = qtd;
        else
            this.quantidade = 0;
        if(val>0)
            this.preco = val;
        else    
            this.preco = 0.0;
    }
    //metodos get para cada variavel de instancia
    public String getNumber(){
        return this.numero;
    }
    public String getDescription(){
        return this.descricao;
    }
    public int getQuantd(){
        return this.quantidade;
    }
    public double getPrice(){
        return this.preco;
    }
    //metodos ser para cada variavel de instancia
    public void setNumber(String num){
        this.numero = num;
    }
    public void setDescription(String desc){
        this.descricao = desc;
    }
    public void setQuantd(int qtd){
        if(qtd>0)
            this.quantidade = qtd;
        else
            this.quantidade = 0;
    }
    public void setPrice(double val){
        if(val>0)
            this.preco = val;
        else    
            this.preco = 0.0;
    }
    //metodo invoice para calcular preco x quantidade
    public  double getInvoiceAmount(){
        return this.quantidade * this.preco;
    }
}