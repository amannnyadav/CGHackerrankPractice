import java.util.Scanner;

public class CanYouAccess {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0 && (n & (n-1))==0){
            System.out.println(n+" is power of 2");
            System.out.println("An instance of class: Solution.Inner.Private has been created");
        }else{
            System.out.println(n+" is not a power of 2");
            System.out.println("An instance of class: Solution.Inner.Private has been created");
        }
    }
}
