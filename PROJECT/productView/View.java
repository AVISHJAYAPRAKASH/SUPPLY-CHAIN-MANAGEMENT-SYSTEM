package productView;
import java.util.Scanner;
import productController.Controller;
import productModel.Model;
public class View
{
	
		public static void main(String[] args) 
		{
			    try (Scanner scanner = new Scanner(System.in)) {
					for(;;) 
					{
						System.out.println("1.ADD PRODUCT");  
						System.out.println("2.DISPLAY ALL PRODUCT DETAILS");
						System.out.println("3.DISPLAY PRODUCT BY PRODUCT ID");
						System.out.println("4.CANCEL THE PRODUCT");
						System.out.println("5.UPDATE THE CUSTOMER PHONENO");
						System.out.println("6.EXIT");
						System.out.println("7.UPDATE THE CUSTOMER PRICE");
						System.out.println("*ENTER THE CHOICE*");
						int choice = scanner.nextInt();
						switch (choice) 
						{
						case 1: 
						{ 

							Model student = new Model();
							System.out.println("ENTER THE PRODUCT ID:");

							int productid = scanner.nextInt();
							student.setProductid(productid);
							System.out.println("ENTER THE PRODUCTNAME:");
							String name = scanner.next();
							student.setName(name);
							System.out.println("QUANTITY:");
							int quantity = scanner.nextInt();
							student.setQuantity(quantity);
							System.out.println("PRICE:");
							double price=scanner.nextDouble();
							student.setPrice(price);
							System.out.println("ENTER THE PHONNO:");
							long phonno = scanner.nextLong();
							student.setPhonno(phonno);
							Controller controller = new Controller();
							boolean res = controller.saveStudent(student);
							if (res == true)
								System.out.println("ORDER SUCESSFULL");

							break;
						}
						case 5: 
						{
							Controller controller = new Controller();
							System.out.println("ENTER PRODUCTID:");
							int id = scanner.nextInt();
							System.out.println("ENTER UPDATE PHONO:");
							long phone = scanner.nextLong();
							boolean res = controller.UpdateByid(id, phone);
							if (res == true)
								System.out.println("USER DETAILS UPDATED");
							else
								System.out.println("USER NOT FOUND");
							break;
						}
						case 7:
						{
							Controller controller= new Controller();
							System.out.println("Enter product id");
							int id= scanner.nextInt();
							System.out.println("Enter updated price");
							int price = scanner.nextInt();
							boolean res=controller.Updatebyprice(id, price);
							if(res == true)
								System.out.println("USER DETAILS UPDATED");
							else
								System.out.println("user not found");
							break;
						}
						case 3: 
						{
							System.out.println("ENTER PRODUCTID:");
							int id = scanner.nextInt();
							Controller controller = new Controller();
						    Model sm = controller.fetchById(id);
							if (sm != null) {
								System.out.println(sm);
							} else
								System.out.println("PRODUCT NOT FOUND");
							break;
						}
						case 2: 
						{
							Controller controller = new Controller();
							controller.fetchAll();
							
							break;
						}
						
						case 4: 
						{
							System.out.println("ENTER THE PRODUCTID NEED TO DELETED:");
							int id = scanner.nextInt();
							Controller controller = new Controller();
							boolean res = controller.removeById(id);
							if (res == true)
								System.out.println("PRODUCT HAS BEEN DELETE SUCCESSFULLY");
							else
								System.out.println("PRODUCT NOT FOUND");
							break;
						}
						case 6:
							System.exit(0);
							break;
						
						default: 
							System.out.println("INVALID CHOICE");
						
						}
					}
				}

	}
	
}
