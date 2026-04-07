package Exception;

public class BankCount  {
    private double balance;
    public BankCount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InSufficientBalanceException {
        System.out.println("取款金额:" + amount + "元,正在处理取款请求");
        if (amount <= 0) {
            throw new IllegalArgumentException("取款金额必须大于0");
        } else if (amount > balance) {
            throw new InSufficientBalanceException(amount - balance);
        }
        balance -= amount;
        System.out.println("取款成功，取款后余额为:" + balance);
        System.out.println("取款完成");
        return;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
