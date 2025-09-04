package productController;
import java.util.ArrayList;
import productModel.Model;

public class Controller
{
	
		private static ArrayList<Model> listOfproducts = new ArrayList<Model>();

		public boolean saveStudent(Model student) 
		{
			listOfproducts.add(student);
			return true;
		}
		public void fetchAll() 
		{
			System.out.println(listOfproducts);
			for(Model sm:listOfproducts)
			{
				double TotalCost=sm.getPrice()*sm.getQuantity();
				System.out.println("TotalCost");
				System.out.println(TotalCost);
			}
		}

		public Model fetchById(int id) 
		{
			for (Model sm : listOfproducts) 
			{
				if (sm.getProductid() == id) 
				{
					return sm;
				}   
			}
			return null;
		}

		public boolean removeById(int id) 
		{
			Model sm = fetchById(id);
			listOfproducts.remove(sm);
			return true;
		}

		public boolean UpdateByid(int id, long phone) 
		{
			Model sm = fetchById(id);
			sm.setPhonno(phone);
			return true;
		}
		
		public boolean Updatebyprice(int id, int price)
		{
			Model sm = fetchById(id);
			sm.setPrice(price);
			return true;
		}
		
		
		
		
	
}
