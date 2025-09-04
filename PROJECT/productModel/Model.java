package productModel;

public class Model
{
		private int productid;
		private String name;
		private int quantity;
		private double price;
		private long phonno;
		
		@Override
		public String toString() {
			return "Model [productid=" + productid + ", name=" + name + ", quantity=" + quantity + ", price=" + price
					+ ", phonno=" + phonno + "]\n";
		}
		public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public String getName() {
			
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public long getPhonno() {
			return phonno;
		}
		public void setPhonno(long phonno) {
			this.phonno = phonno;
		}	
}
