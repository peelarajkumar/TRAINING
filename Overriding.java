public class Overriding {
    
    public static void main(String[] args) {
        Animals dog = new Animals();
        LivingThings lion = new Animals();
        lion.breathe();
       
       

        dog.breathe();
        dog.eat();
        dog.move();
        dog.hunt();
        
    }
}
class LivingThings
{
 void eat()
 {
     System.out.println("LIVING THINGS CAN EAT");
 }
 void breathe()
 {
     System.out.println("LIVING THINGS CAN BREATHE ");
 }
 void move()
 {
     System.out.println("LIVING THINGS MOVE");
 }
}
class Animals extends LivingThings
{
    
 void eat()
 {
     System.out.println("ANIMALS EAT BOTH MEAT AND VEGGIES");
 }
 void breathe()
 {
     System.out.println("LIVING THINGS LIKE ANIMALS  THINGS CAN BREATHE ");
 }
 void hunt()
 {
     System.out.println("ANIMALS HUNT FOR FOOD");
 
 }
 
}
