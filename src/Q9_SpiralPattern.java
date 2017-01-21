import java.util.Scanner;

public class Q9_SpiralPattern {

	int [][] _2DArray;
	
	public void PrintArray(int _rows, int _columns){
			int [][] _2DArray = new int [_rows][_columns];
			
			
			for (int i = 0; i<_rows ; i++){
				for (int j = i;j<_columns;j++){
					_2DArray[i][j] = j;
					System.out.printf("%5d ", _2DArray[i][j]);
				}
				System.out.println();
			}
			
	}
		
			
		
	public static void main(String[] args) {
		Q9_SpiralPattern cq9 = new Q9_SpiralPattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows (int) : ");
		
		int _rows = sc.nextInt();
		System.out.println("Enter columns (int) : ");
		int _columns = sc.nextInt();
		
		sc.close();
		cq9.PrintArray(_rows, _columns);

	}

}
