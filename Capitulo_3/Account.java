public class Account{
    private double balance;
    private String msgdebit;
    // metodo que inicia a conta com um determinado saldo
    public Account(double initialbalance){
        if(initialbalance>0)
            balance = initialbalance;
    }
    // metodo que deposita um saldo
    public void credit(double amount){
        balance+=amount;
    }
    //metodo de debito
    public String debito(double debit){
        if(debit>balance){
            msgdebit ="Debito ultrapassou o saldo";
            return msgdebit;
        }
        else{
            balance-=debit;
            msgdebit = String.format("Foi debitado de sua conta o valor de %.2f",debit);
            return msgdebit;
        }
    }
    //metodo que desconta debito
    public double getBalance(){
        return balance;
    }
} 