import java.util.Scanner;


//Q.2: Input mealPrice(double), tipPercent(int) and taxPercent(int) and calculate the total cost for the meal?
//Eg. mealCost = 12.0, tipPercent = 20 and taxPercent = 8
//Then Total meal cost would be 12.0 + 12.0 x (20/100) + 12.0 x (8/100)

public class Q2_MealCost {
	static Scanner sc;
	public static double _mealPrice;
	public static int _tipPercent;
	public static int _taxPercent;

	
	//Constructor
	Q2_MealCost(){
		sc = new Scanner(System.in);
	}
	
	public double CalculateTotalMealCost(double _mealPrice,int _tipPercent,int _taxPercent){
		double _totalMealCost;
		float _percentPrice = (float)(_mealPrice*_tipPercent)/100;
		float _taxPrice = (float)(_mealPrice*_taxPercent)/100;
		
		_totalMealCost = _mealPrice + _percentPrice+ _taxPrice;
		
		return _totalMealCost;
	}
	
	
	public static void main(String[] args) {
		Q2_MealCost q2 = new Q2_MealCost();
		
		System.out.println("Enter meal Price (double): ");
		_mealPrice = sc.nextDouble();
		
		System.out.println("Enter tip Percent (int): ");
		_tipPercent = sc.nextInt();
				
		System.out.println("Enter tax Percent (int): ");
		_taxPercent = sc.nextInt();
				
		double _totalMealCost = q2.CalculateTotalMealCost(_mealPrice, _tipPercent, _taxPercent);
		
		System.out.println("Total cost of Meal is Rs: " + _totalMealCost);
			
	}

}
