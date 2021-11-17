import java.util.Scanner; 

class Read
{
    public static void main(String[] args) 
    {
	 Scanner obj = new Scanner(System.in);
     System.out.println("Enter company name"); 
     String company = obj.next();   
     System.out.println("Company name is: " + company);        
    }
}
