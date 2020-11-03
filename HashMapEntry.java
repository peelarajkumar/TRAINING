import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntry {
public static void main(String[] args) {
	
	HashMap<Integer,String> week = new HashMap();
	week.put(01, " SUNDAY ");
	week.put(02, " MONDAY");
	week.put(03, " TUESDAY");
	week.put(04, " WEDNESDAY ");
	week.put(05, " THURSDAY");
	week.put(06, " FRIDAY ");
	week.put(07, " SATURDAY ");
	
	Set<Map.Entry<Integer,String>> me=week.entrySet();
	for(Map.Entry<Integer,String> val:me) {
		
		//System.out.println(val); we need only values
		
		System.out.println(val.getValue());
	}
	
	
	
}
}
