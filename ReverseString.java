public class ReverseString {
    public static void main(String[]args){

        String str = "XYZA";
        String rev = "";

        /* Using Concatenation (+ operator)
        int len = str.length();

        for(int i=len-1;i>=0;i--){

            rev = rev + str.charAt(i);

        }
        System.out.println("Reversed String is : " + rev );*/


        // using StringBurffer Class
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversesd no. is " + sb.reverse());



    }
    
}
