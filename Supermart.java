 import java.util.Scanner;
public class Supermart {

    public static void main(String[] args) {

        System.out.println("----------------------------WELCOME TO DMART-------------------------");
        System.out.println("                                                                ");
        System.out.println("    SECTIONS OPEN TODAY : GROCERRIES ,CLOTHING ,HOME APPLIANCES ,FOOD ZONE     ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("    CHOOSE YOUR SECTION  :");
        String sec = sc.nextLine();
        if(sec.equalsIgnoreCase("GROCERRY"))
        {
         System.out.println("------GROCERY SECTION-----");
        Grocerry customer = new Grocerry();
        customer.itemsAvailable();
        customer.itemsNeeded("RICE", "WHEAT", "MEAT");
        customer.price();
        customer.discount(200);
        customer.receipt();
        System.out.println("");
    }
        else if(sec.equalsIgnoreCase("CLOTHING"))
        {
            System.out.println("------CLOTHING SECTION -----");
        Clothing customer = new Clothing();
        customer.brands();
        customer.selectBrands("US POLO ","VOI JEANS");
        customer.cost();
        customer.discount(200);
        customer.receipt();
        }
        else if(sec.equalsIgnoreCase("HOME APPLIANCES"))
        {
        HomeAppliance customer = new HomeAppliance();
        customer.products();
        customer.price("AC");
        }
        else if(sec.equalsIgnoreCase("FOOD ZONE"))
        {
            System.out.println("---FOOD ZONE----");
            System.out.println(" FRANCHISES AVAILABLE : KFC,DOMINOS");
            Scanner st= new Scanner(System.in);
            String zone = st.nextLine();
            if(zone.equalsIgnoreCase("KFC"))
            {
                System.out.println("TODAYS SPECIAL : BUCKET , WINGS");
                System.out.println("SELECT YOUR ORDER ");
               Scanner bc  = new Scanner(System.in);
               String food = bc.nextLine();
               if(food.equalsIgnoreCase("BUCKET"))
               {
               int bill = 799;
                   System.out.println("TOTAL BILL "+bill);
              }
               else if(food.equalsIgnoreCase("wings")){
                   System.out.println("TOTAL BILL = 599");
                   System.out.println("THANKS FOR ORDERING ");
               }
               }
            else if(zone.equalsIgnoreCase("DOMINOS")){
                System.out.println("SORRY - TIME OUT ,PLEASE GO TO KFC ");
            
            }
        }
    }

}
class Clothing
{
void brands(){
    System.out.println("BRANDS AVILABLE ARE : U.S POLO , SPYKAR , WRANGLER , FLYING MACHINE , VOI , LEVIS ,");
}
void selectBrands(String brand1,String brand2)
{
    System.out.println("BRANDS PURCHASED :"+brand1+","+brand2);
}
int cost()
{
    int shirt = 1000;
    int pant = 2000;
    int tshirt = 999;
    int shoes = 4000;
    int price = shirt+pant+tshirt+shoes;
    return price;
}
float discount(int dis)
{
float total_price=cost()-dis;
return total_price;
}
void receipt()
{
float  billpaid=discount(200);
    System.out.println("===RECEIPT===");
    System.out.println("BILL PAID = "+billpaid);
    System.out.println("THANKS FOR SHOPPING");
}
}

class Grocerry {

    void itemsAvailable() {
        System.out.println("GROCERRIES AVAILABLE: RICE , WHEAT , SPECIES , MEAT , OILS , DAIRY PRODUCTS");
    }

    void itemsNeeded(String item1, String item2, String item3) {
        System.out.println(" GROCERRIES PURCHASED :" + item1 + "," + item2 + "," + item3);
    }

    public static int price() {
        int rice = 1000;
        int wheat = 600;
        int meat = 300;
        int species = 100;
        int oils = 400;
        int dairy = 50;
        int total_price = rice + wheat + meat;
        return total_price;
    }

    int discount(int dis) {
        int totprice = price();
        int bill = totprice - dis;
        return bill;
    }

    void receipt() {
        int billpaid = discount(200);
        System.out.println("====RECEIPT====");
        System.out.println("BILL PAID =" + billpaid);
        System.out.println("THANKS FOR SHOPPING");
    }

}
class HomeAppliance
{
void products()
{
    System.out.println("------HOME APPLIANCES=------ ");
    System.out.println(" ");
    System.out.println("WASHING MACHINE , OVEN , AC ,INVERTER ");
    System.out.println("  ");
    System.out.println("ITEMS PURCHASED :");
    Scanner sc = new Scanner (System.in);
    String item = sc.nextLine();
 }
void price(String item)
{
if(item.equalsIgnoreCase("WASHING MACHINE"))
{
   int bill = 50000;
    System.out.println("TOTAL BILL : "+bill+"/-");
}
else if(item.equalsIgnoreCase("OVEN"))
{
    System.out.println("TOTAL BILL : 10000 /-" );
}
else if(item.equalsIgnoreCase("AC"))
{
    System.out.println("TOTAL BILL : 40,000 /-" );
}
else if(item.equalsIgnoreCase("INVERTER"))
{
    System.out.println("TOTAL BILL : 25,000");

}

}


}
