class Car {
String model="";
String variant="";
int speed ;
double price;
float mileage ;
int seat ;
}

class Bike {
String model="";
int price;
int year;
double mileage;
static String country ="INDIA";

}


class Ship{
String type="";
int crew ;
String country="";



}

public class Vehicle
{
 public static void main(String[] args)
{
 Car audi = new Car();
 Car hyundai=new Car();
 Car ferrari = new Car();
 
 Bike RE = new Bike();
 Bike yamaha=new Bike();

 Ship cargo=new Ship();
 Ship warship=new Ship();

audi.model="AQ1";
audi.variant="PETROL";
audi.speed=170;
audi.price=4000000;
audi.mileage=10;

hyundai.model="I20 ASTA";
hyundai.variant="DIESEL";
hyundai.mileage=15;

ferrari.model="ROMA";
ferrari.price=7000000;

RE.model=" THUNDER BOAT ";
RE.year=2020;
RE.mileage=15.55f;

yamaha.model="MT15";
yamaha.price=150000;


cargo.type="SERVIVE";
cargo.crew=350;
cargo.country="GERMANY";


warship.type="NAVAL";
warship.country="INDIA";

System.out.println("         ");
System.out.println("=====CARS===== ");
System.out.println("         ");

System.out.println("AUDI : "+audi.model+", "+audi.variant);
System.out.println("HYUNDAI : "+hyundai.model+" ,"+hyundai.variant );
System.out.println("FERRARI : "+ferrari.model+", "+ferrari.price );
System.out.println("         ");

System.out.println("====BIKES==== ");
System.out.println("         ");
System.out.println(" ROYAL ENFIELd: "+RE.model+" ,"+RE.mileage);
System.out.println(" YAMAHA : "+yamaha.model+", "+yamaha.price);
System.out.println("         ");

System.out.println("=====SHIPS====== ");
System.out.println("         ");
 System.out.println("CARGO : "+cargo.type+" ,"+cargo.country);
 System.out.println(" WARSHIPS : "+warship.type+" ,"+warship.country);






}
 

}

