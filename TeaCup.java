package beverage_machine;

public class TeaCup extends BeverageCup implements Checkable{
        int calorie;
	
        public TeaCup(){
		calorie = 50;
	}
	
	public int checkCalorie(){
                //tea-specific calculation
		return 100;
	}
	public  String getCuptype(){
		return "tea";
	}

}