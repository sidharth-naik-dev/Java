import java.util.Scanner;

public class Palindrome {
    static void main()
    {
        int num, original_number, reversedNumber=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        original_number = input.nextInt();
        num = original_number;
        while(num!=0)
        {
            reversedNumber = reversedNumber*10 + num%10;
            num = num/10;
        }
        if (original_number == reversedNumber)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        input.close();
    }
}