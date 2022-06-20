package ally_project1;

public class main {
	
	public static void fruits(int oranges, int apples) {
		if(oranges < 0 || apples < 0) {
			System.out.println("Please enter valid quantity ( > 0)");
		}
		else {
			combination(oranges,apples);
			smallBoxes(oranges,apples);
		}	
	}
	public static void combination(int oranges, int apples) {//function to count combination box.
		int combinationBox = 0;

		if(oranges <= 0 && apples <= 0) {
			System.out.println("Please enter valid quantity ( > 0)");

		}else {
			while (oranges > 0 || apples > 0) {

				if(oranges >= 100 && apples >= 100) {
					oranges -= 100;
					apples -= 100;
				}
				else if(oranges >= 100 && apples < 100) {
					oranges -= 100;
					apples = 0;
				}
				else if(oranges < 100 && apples >= 100) {
					apples -= 100;
					oranges = 0;
				}
				else {
					oranges = 0;
					apples = 0;
				}

				combinationBox++;			
			}

			System.out.println("Combination boxes required = " + combinationBox);
		}


	}

	public static void smallBoxes(int oranges, int apples) {

		if(oranges > 0) {
			orangeBox(oranges, apples);
		}

		if(apples > 0) {
			appleBox(oranges, apples);
		}


	}

	public static void orangeBox(int oranges, int apples) {

		int smallOrangeBox = 0;

		while(oranges > 0){
			if(oranges >= 50) {
				oranges -= 50;
			}
			else {
				oranges = 0;
			}
			smallOrangeBox++;
		}

		System.out.println("Small orange boxes required = " + smallOrangeBox);

	}

	public static void appleBox(int oranges, int apples) {
		int smallAppleBox = 0;
		while(apples > 0){
			if(apples >= 50) {
				apples -= 50;
			}
			else {
				apples = 0;
			}
			smallAppleBox++;
		}
		System.out.println("Small apple boxes required = " + smallAppleBox);
	}
	public static void main(String[] args) {
		System.out.println("Case 1 :350 oranges and 400 apples");
		main.fruits(350,400);
		System.out.println("Case 2 :50 oranges and 50 apples");
		main.fruits(50,50);
		System.out.println("Case 3 :100 oranges 0 apples ");
		main.fruits(100,0);
	}
	
}
