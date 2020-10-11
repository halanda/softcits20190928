package wu6class;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class TestHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map <String,Book>map = new HashMap<String,Book>();
		 
		  Book book1 = new Book("1", "语文", 55);
	      Book book2 = new Book("2", "数学", 45);
	      Book book3 = new Book("3", "外语", 65)	;
	      map.put("b1", book1);
	      map.put("b2", book2);
	      map.put("b3", book3);
	      
	      System.out.println(map.get("b2"));
//	      System.out.println(map.get(book1.toString()));
//	      for ( Book book: map) {
//	    	  System.out.println(book);
//		}
	      
//	     如何循环Map
	      Set<Entry<String,Book>> set = map.entrySet();
	      for (Entry<String,Book> e : set) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	      
	}

}
