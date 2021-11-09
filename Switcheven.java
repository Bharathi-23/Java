import java.util.Scanner;
public class Switcheven {
	static public void main(String esh[]) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num=scan.nextInt();
			
		
		switch(num%2){
		case 0:
		    System.out.println(num+" is an Even number");
		    break;
		case 1:
		    System.out.println(num+" is an Odd number");
		   break; 
		}
}
}