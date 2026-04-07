package Exception;

import java.util.Objects;

public class InSufficientBalanceException extends BankException{
    private double amount;
    public InSufficientBalanceException(double amount) {
        super("抱歉，您的余额不足。当前缺少: " + amount + " 元",101);
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

}
