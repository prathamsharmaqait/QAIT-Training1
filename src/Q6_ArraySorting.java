import java.util.Arrays;
import java.util.Scanner;

//Q.6 Input a number from console which would be the size of an array of numbers. Now
//input each element for the array for the specified size. Then print the sorted array in
//ascending order.
//Eg. Size of Array : 5
//Input Array elements:
//3
//6
//8
//3
//1
//Sorted Array is : 1 3 3 6 8

public class Q6_ArraySorting {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array (int) : ");
		int _arraySize = sc.nextInt();
		
		int[] _array = new int[_arraySize];
		
		for (int _counter = 0; _counter<_arraySize;_counter++){
			System.out.println("Enter value for element "+ (_counter+1) + " : ");
			_array[_counter]= sc.nextInt();
		}
		sc.close();
		
		//Sort Array
		Arrays.sort(_array);
		
		System.out.println("Sorted Array :");
		
		for (int _elements : _array){
			System.out.println(_elements);
		}

	}
}
