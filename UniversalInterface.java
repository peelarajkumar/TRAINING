
public class UniversalInterface {
    public static void main(String[] args) {
        country india = new country();
        india.name();
        india.rank();
        india.land();
        india.food();
        
    }
    
}
interface Earth
{
    void land();
    void food();
    void air();
}
abstract class Continent
{
  abstract void name();
  abstract void rank();
}
class country extends Continent implements Earth
{
 public void land()
 {
     System.out.println("HAS LUGE LAND");
 }

   
    void name() {
        System.out.println("COUNTRY HAS A  NAME  "); 
    }

    
    void rank() {
        System.out.println("EVERY COUNTRY HAS A RANK "); 
    }

  
    public void food() {
        System.out.println("ASIAN AND CONTINENTAL;");
    }

    
    public void air() {
        System.out.println("30% OF POLLUTED AIR ");
    }
}
