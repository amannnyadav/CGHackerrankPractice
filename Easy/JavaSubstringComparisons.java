import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String smallString=s.substring(0,k);
        String largeString=s.substring(0,k);
        String subString="";
        for(int i=1;i<=s.length()-k;i++){
            subString=s.substring(i,i+k);
            if(subString.compareTo(smallString)<0){
                smallString=subString;
            }
            if(subString.compareTo(largeString)>0){
                largeString=subString;
            }
        }
        System.out.println(smallString);
        System.out.println(largeString);
    }
}
