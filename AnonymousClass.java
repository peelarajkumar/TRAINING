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
public class AnonymousClass {
    public static void main(String[] args) {
        Student Jimmy = new Student()
        {
            void name()
            {
                System.out.println("STUDENT NAME IS JIMMY");
            }
            void rank(){
                System.out.println("STUDENT RANK IS 3");
            }
            void roll_no(){
                System.out.println("STUDENT ROLL NUMBER IS 7");
            }
        
        };
        Jimmy.name();
        Jimmy.rank();
        Jimmy.roll_no();
        
        
        
    }
    
}
abstract class Student{
 abstract void name();
 abstract void rank();
 abstract void roll_no();
    

}

