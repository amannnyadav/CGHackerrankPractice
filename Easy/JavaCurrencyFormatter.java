
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale=new Locale("en","IN");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indFormat=NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String u = usFormat.format(payment);
        String i= indFormat.format(payment);
        String c=chinaFormat.format(payment);
        String f=franceFormat.format(payment);
        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}