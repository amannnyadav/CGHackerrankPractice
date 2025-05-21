import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static boolean flag=true;
    static Scanner sn=new Scanner(System.in);
    static int B=sn.nextInt();
    static int H=sn.nextInt();
    static{
        if(B<0||H<0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
//Write your code here

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}