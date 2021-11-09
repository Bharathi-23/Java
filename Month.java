import java.util.Scanner;
public class Month {

	static public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first 3 letters of a month");
	
		String test = scan.next();
	
		
			switch(test){

			    case "jan":
			    System.out.println("January");
			    break;
			    
			    case "feb":
			    System.out.println("February");
			    break;
		
			    case "mar":
				    System.out.println("March");
				    break;
				    
			    case "apr":
				    System.out.println(" April");
				    break;
				    
			    case "may":
				    System.out.println(" May");
				    break;
			
			    case "jun":
				    System.out.println("June");
				    break;
			
				    case "jul":
					    System.out.println("July");
					    break;
					    
				    case "Aug":
					    System.out.println(" August");
					    break;
					    
				    case "sep":
					    System.out.println(" September");
					    break;
				
				    case "oct":
					    System.out.println("October");
					    break;
				
					    case "nov":
						    System.out.println("November");
						    break;
						    
					    case "dec":
						    System.out.println(" December");
						    break;
					
			    
			    default:
			System.out.println("Please enter correct first three letter of a month");	
			break;			
					
			
			
		}
		
	}
}

