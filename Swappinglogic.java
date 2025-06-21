public class Swappinglogic {
    public static void main(String[] args) {
        int x = 27;
        int y = 3;

        System.out.println("Before Swapping...");
        System.out.println("x = " + x + ", y = " + y);

        // x = x+y;
        // y=x-y;
        // x=x-y;
        //  "OR"
        x = x*y;
        y= x/y;
        x=x/y;

    

       
        System.out.println("After Swapping...");
        System.out.println("x = " + x + ", y = " + y);
    }
}
