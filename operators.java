
public class operators {
	public static void main(String [] args){
		int x=10, y=20,z=25;
		
		int result = ( x > y ) ? (x > z ? x : z) : ( y > z ? y : z);
		System.out.println(result);
		
		
	}

}
