
public class PowerGeneration {
    public static void main(String[] args) {
        Solar plant = new Solar();
        Coal power = new Coal();
       
        plant.efficiency();
        plant.pollution();
        plant.cost();
        plant.area();
        plant.quan();
        
        power.efficiency();
        power.pollution();
        power.cost();
        power.material();
        
        
    }
}

interface Power
{
void efficiency();
void pollution();
void cost();

}
abstract class Renewable
{
    abstract void area();
    abstract void quan();
}
class Solar extends Renewable implements Power
{
public void efficiency(){System.out.println("BETTER EFFICENCY");}
public void pollution(){System.out.println("NO POLLUTION IS EMITTED");}
public void cost(){System.out.println("LESS COST");}
void area(){System.out.println("WHERE SUNLIGHT IS MAXIMUM");}
void quan(){System.out.println("DEPENDS UPON THE SOLAR PANELS     ");System.out.println(" ");}

}
abstract class Nonrenewable
{
 abstract void material();
}
class Coal extends Nonrenewable implements Power
{
public void efficiency(){System.out.println(" LESS  EFFICENCY");}
public void pollution(){System.out.println("POLLUTION IS EMITTED");}
public void cost(){System.out.println("MORE COST");}
void material(){System.out.println("COAL AND WATER ");}
}
