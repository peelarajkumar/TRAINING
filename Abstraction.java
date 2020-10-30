
public class Abstraction {
    public static void main(String[] args) {
        School Dav = new School();
        House vihar = new House();
        Hospital kims = new Hospital();
        Construction all = new Hospital();
        all.plan();
        
        Dav.land();
        Dav.labour();
        Dav.machinery();
        
        vihar.land();
        vihar.labour();
        vihar.machinery();
        
        kims.land();
        kims.labour();
        kims.machinery();
        
    }
 
}
abstract class Construction
{
 abstract void land();
 abstract void machinery();
 abstract void labour();
 void  plan() 
 {
     System.out.println("EVERY CONSTRUCTION MUST HAVE A PLAN ");
     System.out.println(" ");
 }
 }

class School extends Construction
{
 void land()
 {
     System.out.println(" LAND SHOULD BE AWAY FROM TRAFFIC ");
 }
 void machinery()
 {
     System.out.println("MEDIUM LEVEL MACHINERY REQUIRED");
     System.out.println(" ");
 }
 void labour()
 {
     System.out.println(" MORE LABOUR REQUIRED");
 
 }

}
class House extends School 
{
 void machinery()
 {
     System.out.println("REQUIRES LOW LEVEL MACHINERY ");
     System.out.println(" ");
 }
 void labour(){
     System.out.println("LIMITED LABOUR");
 }
}
class Hospital extends Construction
{
  void land()
  {
      System.out.println("HUGE LAND REGUIRED ");
  }
  void machinery()
  {
      System.out.println("ADVANCED LEVEL OF MACHINERY ");
      System.out.println(" ");
  }
  void labour(){
      System.out.println("REQUIRES  SKILLED LABOUR ");
  }
  
}
