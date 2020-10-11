package wu6class;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set <Book>set = new HashSet<Book>();
		 
		  Book b1 = new Book("1", "语文", 55);
	      Book b2 = new Book("2", "数学", 45);
	      Book b3 = new Book("3", "外语", 65)	;
	      set.add(b1);
	      set.add(b2);
	      set.add(b3);
	      set.add(b3);
	      for ( Book book: set) {
			System.out.println(book);
		}
	}

}
