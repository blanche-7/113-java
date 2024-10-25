package edu.shu.hartlin;

public class CashCard  {
    private string number;
    private int balance;
    private int bonus;

    public CashCard(){
        setNumber("Unknown");
    }
    public CashCard(string number){
        setNumber(number);
    }
    public CashCard(string number,int blance){
        setNumber(number);
        setBalance(balance);
    }
    public CashCard(string number,int blance,int bonus){
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
    }

   public String getNumber(){return unmber; }

public