import java.util.Scanner;

public class Palindromme {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no. : ");
    int num = sc.nextInt();
    int rev = 0;
    int org_num = num;

    while(num!=0)
    {

        rev = rev*10 + num%10;
        num = num/10;

    }

    if(org_num == rev)
    {
        System.out.println(" Yayyy!! the enetered  no. is Palindrome");
    }
    else
    {
        System.out.println(" NOT  Palindrome");

    }

}
    
}
