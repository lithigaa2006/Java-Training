package entity;

public class Product {
	private int productID;
	private String prodName;
	private String category;
	private float price;
	private int stockCount;
	
	public Product(int productID, String prodName, String category, float price, int stockCount) {
		this.productID = productID;
		this.prodName = prodName;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", prodName=" + prodName + ", category=" + category + ", price="
				+ price + ", stockCount=" + stockCount + "]";
	}

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	
}