import java.util.Scanner;

//Q.4: Write a ‘Person’ class with an instance variable, age, and a constructor that takes
//a n integer, initialAge, as a parameter. The constructor must assign initialAge to age
//after confirming the argument passed as initialAge is not negative; if a negative
//argument is passed as initialAge, the constructor should set age to 0 and print “Age is
//not valid, setting age to 0.”. In addition, you must write the following instance methods:

//1. yearPasses() should increase the age instance variable by 1.
//2. amIOld() should perform the following conditional actions:
//- age < 13, print “You are young.”.
//- If age >= 13 and age < 18, print “You are a teenager.”.
//- Otherwise, print “You are old.”.

//Next perform the following:
//1. Input the age from the console
//2. Create an object of the Person class using the age you took as input
//3. Call amIOld() method of the Person object
//4. Call the yearPasses() method of the Person object 13 times
//5. Call amIOld() method of the Person object again


public class Q4_PersonClass {

	int _age;
	
	//Constructor
	Q4_PersonClass(int initialAge){
		if (!(initialAge<0))
			this._age = initialAge;
		else{
			this._age = 0;
			System.out.println("Age is not valid");
		}
	}
	
	
	public void yearPasses(){
		_age = _age+1;
		System.out.println(_age);
	}
	
	public void amIOld(){
		if (_age <13)
			System.out.println("You are young");
		else if (_age >=13 && _age<18)
			System.out.println("You are a teenager");
		else
			System.out.println("You are Old");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		Q4_PersonClass cq4p = new Q4_PersonClass(age);
		cq4p.amIOld();
		
		for (int _counter = 1; _counter<=13;_counter++)
			cq4p.yearPasses();

		cq4p.amIOld();
        sc.close();
	}

}
