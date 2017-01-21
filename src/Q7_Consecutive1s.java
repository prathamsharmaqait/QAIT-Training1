import java.util.Scanner;

//Q.7: Input a number and print the maximum number of consecutive 1's in the numbers binary representation.
//Eg. Input number : 50
//Output : 2 (as the binary representation of 50 is 110010 which
//has maximum of 2 1’s which are consecutive)

public class Q7_Consecutive1s {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (int) : ");
		
		int _number = sc.nextInt();
		sc.close();
		String _binary = Integer.toBinaryString(_number);
		int _binaryLength = _binary.length();
		
		System.out.println("Binary Conversion of "+ _number + " : " + _binary);
		System.out.println("Binary Length : "+_binaryLength);
		
		int _output=1;
		
		
		for (int _counter =0;_counter < _binaryLength; _counter++){
			char _currentChar = _binary.charAt(_counter);
			if ((_counter+1)>=_binaryLength)
				break;
			
			char _nextChar = _binary.charAt(_counter+1);
			
			if (_currentChar=='1')
				if (_nextChar =='1')
					_output +=1;
						
		}
		
		System.out.println("Number if consecutive 1s is : "+_output);
		
		
		

	}

}
