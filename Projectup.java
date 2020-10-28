class Student{
int id;
String Father_name="";
String bloodgroup="";
float percentage;
static String school="DAV";
}

class Employee{
int emp_id;
float salary;
int experiance;
static String company_name="WIPRO";
}

class Projectup{
public static void main(String[] args){

Student abhi=new Student();
Student teja = new Student();

abhi.id=1256;
abhi.percentage=95.92f;
abhi.Father_name="RAMESH";


teja.bloodgroup="O-vE";

Employee jack = new Employee();
jack.emp_id=3987;
jack.salary=60000;
jack.experiance=6;


    System.out.println("==========STUDENTS========");
     System.out.println();
System.out.println("STUDENT ID = "+abhi.id);
System.out.println("PERCENTAGE = "+abhi.percentage);
System.out.println("SCHOOLNAME = "+Student.school);
System.out.println("FATHER NAME = "+abhi.Father_name);

System.out.println("BLOOD GROUP = "+teja.bloodgroup);
    System.out.println();
    System.out.println("==========EMPLOYEES=======");
    System.out.println();
System.out.println("EMPLOYEE ID = "+jack.emp_id);
System.out.println("EXPERIANCE = "+jack.experiance);

System.out.println("COMPANY NAME = "+Employee.company_name);




}

}