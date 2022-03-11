package trainingcodes;

public class ternary {

	public static void main(String[] args) {
		int x=59;  
		int y=78;  
		int z=98;  
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber);  

	}

}