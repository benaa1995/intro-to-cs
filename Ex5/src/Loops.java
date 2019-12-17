public class Loops {

	public static int specialMult(int n) {

		//A method that returns the unique double
		int x=n;
		// The type for save the first number
		if (n==11)
			return 0;
		// The number 11 not have specialMult so we protect the programs
		if (1<=n && n<=9) 
			// if the number = 1<=n<=9 we need to return the similar number so we protect the programs
			return n;
		while( n%x!=0 || sumOfDigit(n)!=x){
			// method helps us to found the specialMult,Which each time adds a bar of literature
			n = n +(int) Math.pow(10,numOfDigit(x));
			// We built a formula = the number plus 10 power number of digit 

		}
		return n;
		// return the specialMult number 
	}
	public static void printAllSpecialMult(int n) {
		//Method for print the number and the specialmult
		int temp=n;
		for(int i=1;i<=temp;i++) {
			System.out.println(i+"\t"+specialMult(i));
			//Loops to print the number plus the special multiple

		}

	}

	public static void printWithComma(int n, int d) {
		//The method will print the number (n) with a comma after each number (d).
		if(d==0||n==0) {
			System.out.println(n);
			return;
			//// Method if the number (int n) or number (int d) = 0 so the programs will print the number 0
		}
		int temp =n;
		int numD = numOfDigit(n);
		int flag = numD%d;
		int left=0;
		//Save the all the type we need for the Method
		for(int i=0;i<numD;i++) {
			//Loops for know how many number we have
			if(flag==0)
				flag=d;
			// Method for protect the programs So that there is not comma before the number 
			if(flag==i) {
				System.out.print(",");
				flag+=d;
				// Method for protect the programs,For comma jumps to be exactly by the number (int d)
			}
			left = (int)(temp/(Math.pow(10, numD-1-i)));
			System.out.print(left);
			temp -= left*Math.pow(10, numD-1-i);

		}
	}

	public static int numOfDigit(int n) {
		//Auxiliary method to know the number of digit 
		int c=0 ;
		while (n>0) {
			n/=10;
			c++;
		}
		return c;	
	}

	public static int sumOfDigit(int y) {
		//Auxiliary method to know the sum of digit 
		int sum = 0;
		while (y>0) {
			sum = sum + y % 10 ;
			y = y / 10;
		}
		return sum;




	}}

