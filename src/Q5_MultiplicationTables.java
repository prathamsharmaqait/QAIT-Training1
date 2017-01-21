import java.util.Scanner;

//Q.5: Print the Multiplication tables of all numbers from 1 to 30?

public class Q5_MultiplicationTables {
		
	public void PrintMultiplicationTable(int _number){
	
		for (int _counter =1;_counter<=10;_counter++){
			System.out.println(_number + " X "+ _counter + " = " + _number * _counter );
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 30 to print the Multiplication Table : ");
		int _number = sc.nextInt();
		Q5_MultiplicationTables cQ5 = new Q5_MultiplicationTables();
		cQ5.PrintMultiplicationTable(_number);
		sc.close();

	}

}
