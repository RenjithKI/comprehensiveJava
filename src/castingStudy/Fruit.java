package castingStudy;

public  class Fruit implements Food {
	public float getTotalCalories(){
	      return 0.50f;
	}
   public  String getOrigin(){
	   return "origin";
   }
	@Override
	public String toString() {
		return "Fruit []";
	}
   
}
