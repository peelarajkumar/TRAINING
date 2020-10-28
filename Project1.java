class Student{
int id;
float percentage;
static String school="DAV";
}

class Employee{
int emp_id;
float salary;
static String company_name="WIPRO";
}

public class Project1{
public static void main(String[] args){

Student abhi=new Student();
abhi.id=1256;
abhi.percentage=95.92f;



Employee jack = new Employee();
jack.emp_id=3987;
jack.salary=60000;




    System.out.println("==========STUDENTS========");

System.out.println("STUDENT ID = "+abhi.id);
System.out.println("PERCENTAGE = "+abhi.percentage);
System.out.println("SCHOOLNAME = "+Student.school);
 
    System.out.println("==========EMPLOYEES=======");

System.out.println("EMPLOYEE ID = "+jack.emp_id);

System.out.println("EMPLOYEE SALARY = "+jack.salary);

System.out.println("NAME = "+Employee.company_name);


}

}