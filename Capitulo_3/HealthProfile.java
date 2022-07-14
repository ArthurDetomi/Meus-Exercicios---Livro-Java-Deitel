public class HealthProfile{
    //variaveis de instancia
    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    private int freqmax;
    private double peso;
    private double altura;
    //construtor
    public HealthProfile(String name, String lastname, String genero, double pesoemkg,double height,int day, int month, int year){
        this.nome = name;
        this.sobrenome = lastname;
        this.sexo = genero;
        this.dia = day;
        this.mes = month;
        this.ano = year;
        this.peso = pesoemkg;
        this.altura = height;
    }
    //metodo get
    public String getName(){
        return this.nome;
    }
    public String getLastName(){
        return this.sobrenome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public int getDay(){
        return this.dia;
    }
    public int getMonth(){
        return this.mes;
    }
    public int getYear(){
        return this.ano;
    }
    public double getHeight(){
        return this.altura;
    }
    public double getPeso(){
        return this.peso;
    }
    // meotodo set
    public void setName(String name){
        this.nome = name;
    }
    public void setLastName(String lastname){
        this.sobrenome = lastname;
    }
    public void setSexo(String genero){
        this.sexo = genero;
    }
    public void setDay(int day){
        this.dia = day;
    }
     public void setMonth(int month){
        this.mes = month;
    }
    public void setYear(int year){
        this.ano = year;
    }
    public void setHeight(double height){
        this.altura = height;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    //metodos 
    public int getIdade(){
        this.idade = 2022 - this.ano;
        if(this.mes>4)
            this.idade--;
        if(this.mes==4 && this.dia>10)
            this.idade--;
        return this.idade;
    }   
    public int getFreqCardMax(){
        this.freqmax = 220-this.idade;
        return this.freqmax;
    }   
    public double getFreqCardAlvo(){
        double freqalvo = this.freqmax * 0.85;
        return freqalvo;
    }
    public String getIMC(){
        double imc = this.peso / (this.altura*this.altura);
        String msg2 ="recebera valores";
        if(imc <=18.5)
            msg2 = String.format("IMC :%.2f  - Abaixo do peso",imc); 
        if(imc>18.5 && imc<=24.9)
            msg2 = String.format("IMC :%.2f  - Peso Normal",imc); 
        if(imc>18.5 && imc<=24.9)
            msg2 = String.format("IMC :%.2f  - Peso Normal",imc); 
        if(imc>24.9 && imc<=29.9)
            msg2 = String.format("IMC :%.2f  - Sobrepeso",imc); 
        if(imc>29)
            msg2 = String.format("IMC :%.2f  - Obeso",imc); 
        return msg2;
    }
}