import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateCollectionIUsingMap {

	public static void main(String[] args) {
		
		Map<Integer,Student> hm=new HashMap();
		hm.put(1, new Student(1,"name1","email1"));
		hm.put(2, new Student(2,"name2","email2"));
		hm.put(3, new Student(3,"name3","email3"));
		hm.put(4, new Student(4,"name4","email4"));
		hm.put(5, new Student(5,"name5","email5"));
		hm.put(6, new Student(6,"name6","email6"));
	    
		hm.forEach((k,v)->System.out.println(k+"\t"+v));
       
	}

}
