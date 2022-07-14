public class HeartRates{
    //variaveis de instancia
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    private int freqmax;
    //construtor
    public HeartRates(String name, String lastname, int day, int month, int year){
        this.nome = name;
        this.sobrenome = lastname;
        this.dia = day;
        this.mes = month;
        this.ano = year;
    }
    //metodo get
    public String getName(){
        return this.nome;
    }
    public String getLastname(){
        return this.sobrenome;
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
    //metodo set
    public void setName(String name){
        this.nome = name;
    }
    public void setLastname(String lastname){
        this.sobrenome = lastname;
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
    //metodos
    public int getIdade(){
        this.idade = 2022 - this.ano;
        if(this.mes>4)
            this.idade--;
        if(this.mes==4 && this.dia>10)
            this.idade--;
        return this.idade;
    } 
      
    public int getFrequenciaCard(){
        this.freqmax = 220 - this.idade;
        return this.freqmax;
    }
    public double getFrequenciaAlvo(){
        double freqalvo = this.freqmax * 0.85;
        return freqalvo;
    }
}