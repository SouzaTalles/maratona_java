package maratonajava.javacore.ZZFthhreads.dominio;

public class Account {
    private int balance = 50;

    public void withdrawlal(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
