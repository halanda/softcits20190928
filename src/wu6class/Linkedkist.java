package wu6class;

import java.util.*;

public class Linkedkist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List <Book>listBook = new LinkedList<Book>();
	      Book b1 = new Book("1", "语文", 55);
	      Book b2 = new Book("2", "数学", 45);
	      Book b3 = new Book("3", "外语", 65)	;
	      listBook.add(b1);
	      listBook.add(b2);
	      listBook.add(b3);
//	      父类的
	      listBook.add(b3);
//	      向下造型
	      LinkedList <Book>ll = (LinkedList)listBook;    

//	      子类的first
	      ll.addFirst(b1);     
	      
//	      Link<Book>listBook = null;
//	      ListBook = new LinkedList<Book>();
	      
	      System.out.println(listBook.size());
	      System.out.println(ll.getFirst()); 
	     for (Book book : ll) {
	    	 System.out.println(book);
		}
	      
		
	}

}
