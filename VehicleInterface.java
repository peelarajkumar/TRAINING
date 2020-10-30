
public class VehicleInterface {
    public static void main(String[] args) {
        Audi A7 = new Audi();
        Enfield Thunderbolt = new Enfield();
        
        
        A7.brakes();
        A7.fuel();
        A7.radio();
        A7.smoke();
        A7.speed();
        A7.tyres();
        A7.vipers();
        
        Thunderbolt.brakes();
        Thunderbolt.fuel();
        Thunderbolt.smoke();
        Thunderbolt.speed();
        Thunderbolt.stand();
        Thunderbolt.tyres();
        
        
        
        
    }
  
}
interface Vehicles
{
void speed();
void tyres();
void fuel();
void brakes();
default void smoke()
{
    System.out.println("ELECTRIC VEHICLES DO NOT EMIT SMOKE");
}

}
abstract class Car implements Vehicles
{
    
abstract void vipers();
 void radio ()
 {
     System.out.println("CARS HAVE RADIO ");
 }
}
class Audi extends Car
{
    public void speed()
    {
        System.out.println(" MAXIMUM SPEED OF AUDI IS 180KMPH");
    }
    public void tyres(){
        System.out.println("ALLOY WHEEL TYRES ");
    }
public void fuel()
{
    System.out.println("PETROL OR DIESEL ");
}

    @Override
    public void brakes()
    {
        System.out.println("ELECTRIC BRAKING ");
    }
void vipers()
{
    System.out.println("BRUSHES AS VIPERS ");
    System.out.println(" ");
}
}
abstract class Bike implements Vehicles
{
void stand()
{
    System.out.println(" ONLY BIKES HAVE STANDS ");
}
}
class Enfield extends Bike
{

   
    public void speed() {
        System.out.println("SPEED OF ROYAL ENFIELD IS 150KMPH"); 
    }

   
    public void tyres() {
        System.out.println("MRF TYRES"); 
    }

   
    public void fuel() {
        System.out.println("PETROL"); 
    }

    
    public void brakes() {
        System.out.println("ABS SYSTEM"); 
    }

}
