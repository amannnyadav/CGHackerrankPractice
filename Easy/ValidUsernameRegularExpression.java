import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String pattern="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        for(int i=0;i<n;i++){
            System.out.println(sc.nextLine().matches(pattern)?"Valid":"Invalid");
        }
        sc.close();
    }
}
