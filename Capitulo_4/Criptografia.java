public class Criptografia{
    private int numero;
    public Criptografia(int number){
        this.numero=numero;
    }
    //metodo get
    public int GetNumber(){
        return this.numero;
    }
    //metodo set
    public void SetNumber(int number){
        this.numero=number;
    }
    //metodo de descriptografia
    public int Descripto(){
        int m,c,d,u,mod;
        m=this.numero/1000;
        mod=this.numero%1000;
        c=mod/100;
        mod%=100;
        d=mod/10;
        mod%=10;
        u=mod;
        int descrip=(d*1000)+(u*100)+(m*10)+c;
        m=descrip/1000;
        mod=descrip%1000;
        c=mod/100;
        mod%=100;
        d=mod/10;
        mod%=10;
        u=mod;
        m=(m+10)-7;
        c=(c+10)-7;
        d=(d+10)-7;
        u=(u+10)-7;
        descrip=(m*1000)+(c*100)+(d*10)+u;
        this.numero=descrip;
        return descrip;
    }

    

}