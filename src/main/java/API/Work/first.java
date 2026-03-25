package API.Work;

public class first {
    public static void main(String[] args) {
        String phoneNumber = "12345678910";
        String email = "12345678910@qq.com";
        StringBuilder sb1 = new StringBuilder(phoneNumber.substring(0,3));
        StringBuilder sb2 = new StringBuilder(email.substring(0,1));
        sb1.append("****").append(phoneNumber.substring(7));
        sb2.append("****");

        int k = email.indexOf((int)'@');
        sb2.append(email.substring(k));

        System.out.println(sb1);
        System.out.println(sb2);
    }
}
