package Assignmenmt;

public class FactoryMethod {

	public static void main(String[] args) {
		BMW B1 = new BMW();
		Audi A1 = new Audi();
	  CarFactory x = new CarFactory();
	 
	  Car d = x.getCar("BMW");
	  Car c = x.getCar("AUDI");
	  
	  c.cost();
	  c.mileage();
	  
	  
	  d.cost();
	  d.mileage();
	  }

}
 abstract class Car
 {
    abstract void cost();
    abstract void mileage();
}
 
 class BMW extends Car
 {

	@Override
	void cost() {
 System.out.println("COST OF BMW IS 40 LAKHS");
		
	}

	@Override
	void mileage() {
	System.out.println("MILEAGE OF BMW IS 10");
		
	}
	 
	 
 }
 class Audi extends Car{

	@Override
	void cost() {

  System.out.println("COST OF AUDI IS 30 LAKHS ");
		
	}

	@Override
	void mileage() {
		System.out.println("MILEAGE OF AUDI IS 11");
		System.out.println(   );
		
	}
	 
	 
 }
 class CarFactory
 {
   public  Car getCar(String carname) {
		 if(carname.equalsIgnoreCase("BMW"))
		return new BMW();
		 else if(carname.equalsIgnoreCase("AUDI")) 
		 return new Audi();
		 else 
			 return null;
			 
		 
		 
	 }
	 
	 
 }
