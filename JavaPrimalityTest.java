import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bign=new BigInteger(n);
        bufferedReader.close();
        if(bign.isProbablePrime(10)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
