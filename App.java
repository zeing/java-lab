import java.util.* ;
public class App
{
    public static void main( String[] args )
    {
        int number = 1359;
        System.out.println("Reverse of number: " + number + " is " + reverse(number));

    }

	private static int reverse(int number) {

        int reverse = 0;
        int remainder = 0;

        do{
        	remainder = number%10;
            System.out.println("remainder:"+remainder);

            reverse = reverse*10 + remainder;
            System.out.println("reverse:"+reverse);

             number = number/10;
            System.out.println("number:"+number);

        }while(number > 0);        return reverse;
	}
}
