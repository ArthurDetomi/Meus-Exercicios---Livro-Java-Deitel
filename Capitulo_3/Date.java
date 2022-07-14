public class Date{
    private int dia;
    private int mes;
    private int ano;
    private String msg;
    public Date(int day, int month, int year){
        this.dia = day;
        this.mes = month;
        this.ano = year; 
    }
    //metodo get
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
    public void setDay(int day){
        this.dia = day;
    }
    public void setMonth(int month){
        this.mes = month;
    }
    public void setYear(int year){
        this.ano = year;
    }
    //metodo display date
    public String displayDate(){
        if(this.dia>9 && this.mes>9){
            msg = String.format("Data :%d/%d/%d",this.dia,this.mes,this.ano);
            return msg;
        } 
        else{
            msg = String.format("Data :0%d/0%d/%d",this.dia,this.mes,this.ano);
            return msg;
        }
    }
}   