import java.util.Scanner;

//Q.3: Given an integer, n, perform the following conditional actions:
//If n is odd, print “Weird”
//If n is even and in the inclusive range of 2 to 5, print “Not Weird”
//If n is even and in the inclusive range of 6 to 20, print “Weird”
//If n is even and greater than 20, print “Not Weird”

public class Q3_IntegerConditionalActions {
	
	public static void main(String[] args) {
			
		int n;
		
		System.out.println("Enter Value of n (int): ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sc.close();
		
		if (n%2==0){
			if (n >=2 && n <=5)
				System.out.println("Not Weird");
	
			if (n>=6 && n<=20)
				System.out.println("Weird");
			
			if (n>20)
				System.out.println("Not Weird");
		}
		else
			System.out.println("Weird");

	}

}
