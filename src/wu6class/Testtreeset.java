package wu6class;

import java.util.*;
import java.util.Set;

public class Testtreeset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set <Book>set = new TreeSet<Book>();
		 
		  Book b1 = new Book("1", "����", 55);
	      Book b2 = new Book("2", "��ѧ", 45);
	      Book b3 = new Book("3", "����", 65)	;
	      set.add(b1);
	      set.add(b2);
	      set.add(b3);
	      set.add(b3);
	      for ( Book book: set) {
			System.out.println(book);
		}
	}

}

	
	
