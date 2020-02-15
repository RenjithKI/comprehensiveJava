package castingStudy;

public class Apple extends Fruit {
	String colour;
	public float getTotalCalories() {
	    return 0.40f;
	}
	public String getOrigin() {
	    return "someCity";
	  }
	
	 static Food getMeAFruit(){
		return new Apple("red");		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Apple(String colour) {
		super();
		this.colour = colour;
	}
	
	
}

