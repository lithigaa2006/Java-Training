package collection_framework;

import java.util.*;

class Browser{
	Stack<String> history = new Stack<>();
	public void visit(String url) {
		history.add(url);
	}
	public void back() {
		if(history.isEmpty()) {
			System.out.println("The stack is empty!!");
			return;
		}
		System.out.println("Recently visited : "+history.pop());
	}
	public String getCurrentPage() {
		if(history.isEmpty()) {
			System.out.println("The stack is empty!!");
		}
		return history.peek();
	}
	public void showAllHistory() {
		ListIterator<String> iterator = history.listIterator(history.size());
		if(history.isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		System.out.println(" Browsing History..");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	
	
}
public class BrowsingHistoryStack {

	public static void main(String[] args) {
		Browser b1 = new Browser();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("To access Browsing history..\n1-Add\n2-Previously visited..\n3-Current page\n4-Show all");
			choice = sc.nextInt();
			sc.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter the  visited url : ");
			String s = sc.nextLine();
			b1.visit(s);
			System.out.println("History updated...");
			break;
		case 2:
			b1.back();
			break;
		case 3:
			System.out.println("Current page visited: "+b1.getCurrentPage());
			break;
		case 4:
			b1.showAllHistory();
			break;
		default:
			System.out.println("Invalid choice...");
		}
		}while(choice<=4);

	}

}
