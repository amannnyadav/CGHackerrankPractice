import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[] splitStr= s.split("[ !,?._'@]+");
        int strleng=splitStr.length;
        if(s.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(strleng);
            for(int i=0;i<strleng;i++){
                System.out.println(splitStr[i]);
            }
        }
        scan.close();
    }
}
