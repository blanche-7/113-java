import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                // new CashCard("A004", 2000, 2),
                // new CashCard("A005", 3000, 3)
        };
        Scanner input=new Scanner(System.in);

   //     for(var card : cards) {
   //         System.out.printf("(%s, %d, %d)%n",
    //                card.number, card.balance, card.bonus);
    //        //card.store(input.nexInt());
    //        card.balance+=input.nextInt();
     //       System.out.printf("明細(%s, %d, %d)%n",
    //                card.number,card.balance,card.bonus);
    //    }
        for(int i=0;i<cards.length;i++){

        }
    }
}
package edu.shu.hartlin;

public class CashCard {
    private string number;
    private int balance;
    private int bonus;
    private final int BOUNSCASH=10;


    public CashCard() {
        setNumber("Unknown");
    }

    public CashCard(string number) {
        setNumber(number);
    }

    public CashCard(string number, int blance) {
        setNumber(number);
        setBalance(balance);
    }

    public CashCard(string number, int blance, int bonus) {
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
    }

    public String getNumber() {
        return unmber;
    }

    public

    public void store(String number, int money) {
        if (this.number.equals(number)) {
            if (money > 0) {
                this.balance += money;
                if (money >= 1000) this, bonus += money / 1000;
            } else {
                system.out.println("儲值金額為負，來亂的!");
            }
        } else {
            system.out.println(("卡號不符"));
        }
    }
}
private void topUp(int money){
    if (money > 0) {
        this.balance += money;
        if (money >= 1000) {
            this, bonus += money / 1000;
        }
    } else {
        system.out.println("儲值金額為負，來亂的!");
    }
}
public int exchange(int bonus){
    if (bonus >0&&this.bonus >=bonus){
        this.bonus -=bonus;
        setbalance(this.balance+bonus*BOUNSCASH);
    }
    else{
        system.out.println("點數不足");
    }
    return this.bonus;

}
    private void charge(string number,int money){
    if (this.number.equals(number)){
        eschange(bonus);
        deduction(money);
    }
     else{
         System.out.println(("卡號不符"));
    }
     public cashcard(){setNumber("unknown");}
     public cashCard(string unmber){
         setNumber(number);
         system.out.printf("第%d張卡%n",++this.cardOrder);
        }




    }
