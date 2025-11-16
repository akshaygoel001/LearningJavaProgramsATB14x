package coding_challenge_16112025;

public class Challenge4 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        double balanceAfterDeposit = bankAccount.deposit(500);
        double balanceAfterWithdrawal = bankAccount.withdraw(200);
        System.out.println("Balance after deposit: "+balanceAfterDeposit+" Balance after withdrawal: "+balanceAfterWithdrawal);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double deposit(double deposit){
        this.balance =  getBalance() + deposit;
        return getBalance();
    }

    public double withdraw(double withdrawal){
        return getBalance() - withdrawal;
    }

    public double getBalance(){
        return this.balance;
    }
}
