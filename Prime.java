import java.util.Scanner;

public class Prime { 
    // Natural no.>1 
    // only 2 factors 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to Check Prime : ");
        int num = sc.nextInt();
        int count =0;

        if (num>1) 
        {
            
            for(int i=1; i<=num; i++)
            {
                if(num%i == 0)
                    count++; 
            }
            if(count == 2)
            System.out.println("Prime No.");
            else
            System.out.println("NOT Prime No.");

        }
        else
        {
            System.out.println("Given No. is NOT Prime");
        };
        
    }
    
}
