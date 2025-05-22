import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < b.length(); j++){
                if(arrayA[i] == arrayB[j]){
                    arrayA[i] = 0;
                    arrayB[j] = 0;
                }
            }
        }

        for(int i = 0; i < a.length(); i++){
            if(arrayA[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
