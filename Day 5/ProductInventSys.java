package exception;

import java.util.Scanner;
import entity.Product;
import exception.ProductNotFoundException;
import ProductService.*;

public class ProductInventSys {

	public static void main(String[] args) throws ProductNotFoundException {
		Scanner sc = new Scanner(System.in);
		ProductServiceImpl service= new ProductServiceImpl();
		int choice;
		do{
			System.out.println("Enter the choice: \n"+"1- Show all product\n"+"2-Search Product\n"+"3-Add Product\n"+"4-Update stock of a product\n"+"5-Delete a product" );
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				for(Product p:service.getAllProducts()) {
					System.out.println(p);
				}
				break;
			case 2:
				System.out.println("Enter the Product Id to search: ");
		
				int s = sc.nextInt();
				try {
					service.searchProduct(s);
				}
				catch(ProductNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter the  new proId:");
				int pid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the product name: ");
				String pname = sc.nextLine();
				System.out.println("Enter the category:  ");
				String pcty = sc.nextLine();
				System.out.println("Enter the Price: ");
				float pp = sc.nextFloat();
				System.out.println("Enter  the stock avaliable :");
				int scount = sc.nextInt();
				service.addNewProduct(new Product(pid, pname, pcty, choice, scount));
				break;
			case 4:
				System.out.println("Enter the product Id: ");
				try {
					service.updateStock(sc.nextInt());
				}
				catch(ProductNotFoundException e){
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println("Enter the Product id to delete a product: ");
				try {
					service.deleteProduct(sc.nextInt());
				}
				catch(ProductNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Invalid choice");
				
			}
		}while(!(choice >=6));
   }

}