package castingStudy;

public class castStudy {

	public static void main(String[] args) {
		Food food = Apple.getMeAFruit();
		System.out.println(food.toString());
		
		
		float st = food.getTotalCalories();
		System.out.println(st);
		
		// cast issue 
		Apple app = (Apple) food;
		/* this wont work */		
		//String stt = food.getColour();
		/* but this will work*/
		String stt = app.getColour();		
		System.out.println("color >>>>>>"+stt);
		
		Fruit f = new Fruit();		
		/* wont work*/
		try {
			Apple app2 = (Apple) f;
		} catch(Exception e){
			System.out.println("exception is thrown ...");
			//e.printStackTrace();			
		}
		Fruit f2 = new Apple("yellow");
		Apple app3 = (Apple) f2;
		System.out.println("color >>>>>>"+app3.getColour());
	}



}
