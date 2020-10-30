
public class MultiLevel0verriding {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Plant mango = new Plant();
        LivingThing a = new Plant();
        LivingThing b = new Animal();
        
        
        dog.breathe();
        dog.eat();
        dog.move();
        
        mango.eat();
        mango.breathe();
        mango.move(); 
        
        a.eat();
        b.move();
        
        
        
    }
}
class LivingThing
{
 void eat()
 {
     System.out.println("LIVING THINGS CAN EAT");
     System.out.println(" ");
 }
 void breathe()
 {
     System.out.println(" LIVING THINGS CAN BREATHE ");
     System.out.println(" ");
 }
 void move()
 {
     System.out.println("LIVING THINGS MOVE");
     System.out.println(" ");
 }
}
class Animal extends LivingThing
{
 void eat()
 {
   
     System.out.println("ANIMALS EAT BOTH MEAT AND VEGGIES");
   
 }
 void move()
 {   
     System.out.println("ANIMALS MOVE ");
     System.out.println("");
 }
 
}
class Plant extends LivingThing
{
 @Override
 void eat()
 {  
     System.out.println("PLANTS DO NOT EAT MEAT ");
    
 }
 void move()
 {
     System.out.println("PLATS GREW ");
     System.out.println("");
 }
}
