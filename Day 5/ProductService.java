package ProductService;
import java.util.*;
import exception.ProductNotFoundException;
import entity.*;
public interface ProductService {
	List<Product> getAllProducts();
	void searchProduct(int proId) throws ProductNotFoundException;
	void addNewProduct(Product newProduct);
	void updateStock(int proId) throws ProductNotFoundException;
	void deleteProduct(int proID) throws ProductNotFoundException;
}