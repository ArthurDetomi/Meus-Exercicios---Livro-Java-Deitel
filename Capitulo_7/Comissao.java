public class Comissao{
    private int [] listaFunc;
    private int totalFunc=10;
    //metodos saudacao
    public void getSaudacao(int pos){
        System.out.printf("\nBem vindo Funcionario %d\n",pos+1);
    }
    //metodos set
    public void setTotalFuncionario(int total){
        this.totalFunc=total;
        armazenamento();
    }
    //metodos principais
    public int comissaoCalculo(int pos,int totalBruto){
        double calc=200+(totalBruto*0.09);
        int comissao=(int)calc;
        listaFunc[pos]=comissao;
        return comissao;
    } 
    //array
    private void armazenamento(){
        listaFunc=new int[this.totalFunc];
    }
    public void getArray(){
        this.totalFunc
        for(int val:listaFunc){

            System.out.printf("\n%d\n",val);
        }
    }   
}