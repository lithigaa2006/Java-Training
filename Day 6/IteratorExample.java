package collection_framework;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Ron");
		l.add("John");
		l.add("Harry");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {//check whether it has a next element
			System.out.println(itr.next());
		}
	}
}
