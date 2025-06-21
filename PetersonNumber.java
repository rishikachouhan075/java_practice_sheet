import java.util.Scanner;

public class PetersonNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. to check PetersonNumber : ");
        int num = sc.nextInt();
        int originalno = num;
        int peterson = 0;

        while(num>0)
        {
            int fact =1;
            int rem = num%10;
            for(int i = 1; i <=rem; i++)
            {
                fact = fact*i;
            }

            System.out.println("here " + fact);

            peterson = peterson + fact;
            num = num/10;

        }
        
            System.out.println("here " + num);


        if(originalno == peterson)
        {
            System.out.println("PETERSON");
        }else
        {
            System.out.println(" NOT PETERSON");

        }
    }
    
    }
