package wu6class;
import java.util.*;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add(1);
		list.add("test");
		list.add(new Date());
		list.add(true);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list.contains("test"));
		System.out.println(list.remove(1));
		System.out.println(list.isEmpty());
		System.out.println(list.clear());
		
		
	}

}
