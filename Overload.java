
public class Overload
{
public static void main(String[] args)
{
Restaurant Chutneys = new Restaurant();
Chutneys.itemsAvailable();
Chutneys.takeOrder("PIZZA");
Chutneys.takeOrder("DOSA","PIZZA");
Chutneys.takeOrder(30.2f,300);

}

}

class Restaurant
{
void itemsAvailable()
{
System.out.println("ITEMS AVAILABLE : DOSA , IDLY , PIZZA , BURGER");
}
void takeOrder(String item1)
{
    System.out.println("ITEMS ORDERED :"+item1);
}
void takeOrder(String item2,String item3)
{
    System.out.println("ITEMS ORDERED :"+item2+" "+item3);
}
void takeOrder(float tax ,int bill)
{
    System.out.println(tax+bill+"RS = TOTAL BILL ");
}


}
