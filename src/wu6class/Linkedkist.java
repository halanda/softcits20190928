package wu6class;

import java.util.*;

public class Linkedkist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List <Book>listBook = new LinkedList<Book>();
	      Book b1 = new Book("1", "����", 55);
	      Book b2 = new Book("2", "��ѧ", 45);
	      Book b3 = new Book("3", "����", 65)	;
	      listBook.add(b1);
	      listBook.add(b2);
	      listBook.add(b3);
//	      �����
	      listBook.add(b3);
//	      ��������
	      LinkedList <Book>ll = (LinkedList)listBook;    

//	      �����first
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
