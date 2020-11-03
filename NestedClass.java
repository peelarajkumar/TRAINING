/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks;

/**
 *
 * @author Welcome
 */
public class NestedClass {
    public static void main(String[] args) {
        Animals wild = new Animals();
        wild.eat();
        
        Animals.Dog pumerian = new Animals().new Dog();
        pumerian.food();
        
        
    }
}

class Animals
{
   void walk(){
       System.out.println("ANIMALS WALK");
   }
    void eat(){
        System.out.println("ANIMALS EAT");
    }
    
    class Dog
    {
    void run()
    {
        System.out.println("DOGS RUN");
    }
    void food(){
        System.out.println("DOGS EAT FLESH");
    }
    
    }

}
