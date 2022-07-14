public class Employe{
    //variaveis de instancia
    private String nome;
    private String sobrenome;
    private double salario;
    //construtor
    public Employe(String name,String lastname,double sal){
        this.nome = name;
        this. sobrenome = lastname;
        if(sal>0)
            this. salario = sal;
    }
    //metodo get 
    public String getName(){
        return this.nome;
    }
    public String getlastName(){
        return this.sobrenome;
    }
    public double getSalario(){
        return this.salario;
    }
    //meotodo set 
    public void setName(String name){
        this.nome = name;
    }
    public void setlastName(String lastname){
        this.sobrenome = lastname;
    }
    public void setSalario(double sal){
        if(sal>0)
            this. salario = sal;
    }
    //aumento de 10 por cento
    public double getAumentoSal(){
        this.salario*=1.1;
        return this.salario;
    } 
}