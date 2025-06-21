import java.util.Scanner;

public class String_vowel_conso {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to count Vowel Consonent in it :");
    String new_string = sc.nextLine();
    int Vcnt = 0;
    int Ccnt = 0;

    new_string = new_string.toLowerCase();

    for(int i = 0; i<new_string.length();i++)
    {
        if(new_string.charAt(i)=='a' || new_string.charAt(i)=='e' || new_string.charAt(i)=='i'|| new_string.charAt(i)=='o' ||new_string.charAt(i)=='u'){
        Vcnt++;
        // System.out.println("Vowel count in the String is " + Vcnt);
        }

        else {

            Ccnt++;
            // System.out.println("Consonent count in the String is " + Ccnt);
        }
    }
    System.out.println("Vowel count in the String is " + Vcnt);
    System.out.println("Consonent count in the String is " + Ccnt);



}
}
