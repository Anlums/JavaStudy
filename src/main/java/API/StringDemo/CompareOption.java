package API.StringDemo;

import java.util.Scanner;

public class CompareOption {
    public static void main(String[] args) {
    //  比较方法
        String rightUsername = "zhangsan";
        String rightPassword = "123";
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            username = sc.next();
            password = sc.next();
            if(rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            }else {
                if(i == 2) {
                    System.out.println("账号锁定");
                }
                else {
                    System.out.println("账号密码错误");
                }
            }
        }



    }

}
