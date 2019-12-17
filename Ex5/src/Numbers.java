
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num,firstNum,secondNum,thirdNum,calculator,cheker;

		System.out.println("Please enter a number");

		num = scan.nextInt();
		firstNum = num %10;
		secondNum = (num /10) %10;
		thirdNum = num /100;
		calculator = firstNum*firstNum*firstNum+secondNum*secondNum*secondNum+thirdNum*thirdNum*thirdNum;

		if (num==calculator)
			System.out.println("The number "+num+" is an Armstrong number" );
		else
			System.out.println("The number " +num+ " is not Armstring number");

		if (num>999 && num<100000) {
			firstNum=num %10;
			secondNum = (num/10)%10;
			cheker = firstNum*10 + secondNum;

			if (cheker==num/100)
				System.out.println("the number "+num+" is a palindrome");
			else
				System.out.println("the number "+num+" is not a palindrome");
		}
	}
}