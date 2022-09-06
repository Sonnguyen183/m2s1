import java.sql.SQLOutput;
import java.util.Scanner;

public class convertmoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USd:");
        usd = sc.nextDouble();
        double  quydoi = usd    * 23000;
        System.out.print("VND" + quydoi);
    }
}
