import java.util.Scanner;

public class java_test01{
    
    public static void main(String[] args) {
        int A,B,addresult;

        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();

        addresult = A + B;
        System.out.println(addresult);
    }
    
}