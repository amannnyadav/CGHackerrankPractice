import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        for(int i = 1; sc.hasNext(); i++){
            String N = sc.nextLine();
            System.out.println(i + " " + N);
        }
        sc.close();
    }
}
