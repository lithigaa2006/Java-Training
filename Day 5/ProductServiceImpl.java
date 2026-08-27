package ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Product;
import exception.ProductNotFoundException;
public class ProductServiceImpl implements ProductService{
	Scanner sc = new Scanner(System.in);
	List<Product> allProducts = new ArrayList<>(
		List.of(new Product(123,"Toy","Wood",700.00f,56)));
	
	public List<Product> getAllProducts() {
		return allProducts;
	}

	public void searchProduct(int proId) throws ProductNotFoundException {
		for(Product p:allProducts) {
			if(p.getProductID() == proId) {
				System.out.println(p);
				return;
			}
		}
		throw new ProductNotFoundException("Product not Found!!");
		
	}
	public void addNewProduct(Product newProduct) {
		allProducts.add(newProduct);
		System.out.println("New Product added sucessfully!!");
		System.out.println(newProduct);
	}
	public void updateStock(int proId) throws ProductNotFoundException {
		for(Product p:allProducts) {
			if(p.getProductID()==proId) {
				System.out.println("Enter the updated stock: ");
				int stock = sc.nextInt();
				p.setStockCount(stock);
				System.out.println("Stock updated successfully...");
				System.out.println(p);
				return;
			}
		}
		throw new ProductNotFoundException("Product not found!!!");
	}

	public void deleteProduct(int proID) throws ProductNotFoundException {
		for(Product p:allProducts) {
			if(p.getProductID()==proID) {
				allProducts.remove(p);
				System.out.println("Product removed successfully!!!");
				return;
			}
		}
		throw new ProductNotFoundException("Product not found..");
	}
}