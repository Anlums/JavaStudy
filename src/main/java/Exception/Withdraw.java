package Exception;

import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        BankCount bc = new BankCount(100.0);
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入取款金额:");
            double wd = sc.nextDouble();
            bc.withdraw(wd);
            System.out.println("取款后金额：" + bc.getBalance());
        } catch (BankException e) {
            System.err.println("【银行系统错误】代码:" + e.getErrorcode() + " 消息:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("【系统错误】" + e.getMessage());
        }


//        Scanner sc = new Scanner(System.in);
//        BankCount bc = new BankCount(1000);
//        double wd = sc.nextInt();
//        try {
//            bc.withdraw(wd);
//        } catch (InSufficientBalanceException e) {
//            System.err.println("【业务提示】" + e.getMessage());
//            System.out.println("建议：请存入至少 " + e.getAmount() + " 元后再重试。");
//        } catch (IllegalArgumentException e) {
//            System.err.println("【输入错误】" + e.getMessage());
//        } finally {
//            System.out.println("--------");
//            System.out.println("当前余额为:" + bc.getBalance());
//
//        }


//        getMessage()
//        返回异常的详细消息字符串
//        toString()
//        返回异常的简短描述(包含异常类型和消息)
//        printStackTrace()
//        打印完整的堆栈跟踪信息(用于调试)
//        getCause()
//        返回导致此异常的原因

    }

}
