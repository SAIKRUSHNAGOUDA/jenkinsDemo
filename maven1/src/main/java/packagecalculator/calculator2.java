package packagecalculator;

public class calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator objscientificcalculator=new calculator();
		String StrResult=objscientificcalculator.getwishes();
		
		if(StrResult.contains("Hello world")){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		int resultAddition=objscientificcalculator.addition(12, 12);
		
		if(resultAddition==24){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		

	}

}