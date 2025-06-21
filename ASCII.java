import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any No. or digit to get its ASCII value");
        char value = sc.next().charAt(0);
        int asciivalue = value;
        System.out.println("ASCII value of " + value + " is " + asciivalue );

    }
    
}

