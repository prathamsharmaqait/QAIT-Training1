import java.util.Scanner;

//Q.8: Input a number and print all the prime factors of the number
//Eg. Input number : 20
//Output: 2,2,5
//Input number : 372
//Output : 2,2,3,31



public class Q8_PrintingPrimeFactors {
	
	public void PrintPrimeFators(int _number){
		for (int i = 2 ; i<=_number;i++){
			while (_number%i==0){
				System.out.println(i);
				_number= _number/i;
			}
		}
		
	}
	
	public static void main(String[] args) {
			Q8_PrintingPrimeFactors cq8 = new Q8_PrintingPrimeFactors();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number (int) : ");
			
			int _number = sc.nextInt();
			sc.close();
			cq8.PrintPrimeFators(_number);
			

	}

}
