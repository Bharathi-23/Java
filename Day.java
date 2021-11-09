import java.util.Scanner;
public class Day {
	
		static public void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Day number ");
			int x = scan.nextInt();
			
			switch(x) {
			case 1:
				System.out.println("Day is Sunday");
				break;
				
			case 2:
				System.out.println("Day is Monday");
				break;
			
			case 3:
				System.out.println("Day is Tuesday");
				break;
				
			case 4:
				System.out.println("Day is Wednesday");
				break;
				
			case 5:
				System.out.println("Day is Thursday");
				break;
				
			case 6:
				System.out.println("Day is Friday");
				break;
				
			case 7:
				System.out.println("Day is saturday");
				break;
			
			default:
				System.out.println("please enter number between 1 to 7 only");	
				break;			
						
				
				
			}
			
		}
	}


