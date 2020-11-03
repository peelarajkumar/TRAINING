import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetEntry {

	public static void main(String[] args) {
         
		HashMap<Integer,String> mon = new HashMap();

		mon.put(01, " JANUARY ");
		mon.put(02, " FEBRUARY");
		mon.put(03, " MARCH ");
		mon.put(04, " APRIL ");
		mon.put(05, " MAY ");
		mon.put(06, " JUNE ");
		mon.put(07, " JULY ");
		mon.put(8, " AUGUST ");
		
		
		Set x  = mon.entrySet();
		Iterator it = x.iterator();
		System.out.println( "SEPERATING KEYS AND VALUES ");
		while(it.hasNext()) 
		{
			
		  Map.Entry mp = (Map.Entry) it.next();
		  
		  System.out.println(mp.getKey()+" "+mp.getValue());
			
		}
		
		
		
		
		

	}

}
