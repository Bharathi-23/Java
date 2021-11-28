
import java.util.Scanner;
public class sumavgarr {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
		
		int numbers[] = new int[10];
		int i=0;
		
		do{
			System.out.println("Enter the numbers");
			
		numbers[i]= scan.nextInt();
		i=i+1;
		}
while(i<10);
		int sum=0;
		int x=0;
		
		do {
		
		
		sum=sum+numbers[x];
		x=x+1;
		}
		while(x<10);
		
		System.out.println("Total of numbers is "+sum);
		float avg=sum/(1.0f*x);
		System.out.println("The average of numbers  is"+avg);
		
}
}