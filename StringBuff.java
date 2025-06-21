import java.util.Scanner;

public class StringBuff {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed value of no. : " + rev);

    }
    
}

