package wu6class;

import java.util.*;

public class Listbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List <Book>listBook = new ArrayList<Book>();
      Book b1 = new Book("1", "����", 55);
      Book b2 = new Book("2", "��ѧ", 45);
      Book b3 = new Book("", "����", 65)	;
      listBook.add(b1);
      listBook.add(b2);
      listBook.add(b3);
      System.out.println(listBook.get(0));
		
	}

}
