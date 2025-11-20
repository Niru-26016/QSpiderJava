class Bank{
    public static void main(String[] args) {
        BankAcc b1=new BankAcc(0);
        b1.checkBalance();
        b1.deposit(500);
        b1.deposit(200);
        b1.Withdraw(150);
        b1.checkBalance();
    }
}

class BankAcc{
    int balance;

    public BankAcc(int a) {
        balance=a;
    }
    void checkBalance(){
        System.out.println("Balance: "+balance);
    }

    void deposit(int a){
        balance+=a;
    }
    void Withdraw(int a){
        if(balance>a){
            balance -= a;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}