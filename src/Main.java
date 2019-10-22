import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        int num, num2, num3, sum;
        System.out.println("Please enter three numbers");
        Scanner key = new Scanner(System.in);
        num = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();
        sum = (num+num2+num3);
        System.out.print(sum);
    }
} 