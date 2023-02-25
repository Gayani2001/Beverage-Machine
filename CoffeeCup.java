package beverage_machine;

public class CoffeeCup extends BeverageCup implements Checkable{
	int calorie;
	
        public CoffeeCup(){
		calorie = 100;
	}
	
	public int checkCalorie(){
                //coffee-specific calculation
		return 150;
	}
	public  String getCuptype(){
		return "coffee";
	}

}