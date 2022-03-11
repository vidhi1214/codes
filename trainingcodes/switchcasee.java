package trainingcodes;

public class switchcasee {

	public static void main(String[] args) {
		
		        try{
		            int[] a = new int[5];
		            a[5] = 10;
		        }
		        catch(ArrayIndexOutOfBoundsException e){
		            System.out.println("Exception occured");
		        }
		        finally{
		            System.out.println("Finally block");
		        }
		        
		      
		      
		        try{                        
		            System.out.println("s1");             
		            System.out.println("s2");
		            System.out.println("s3");
		            try{
		                System.out.println("s4");
		                
		                System.out.println("s5");
		                System.out.println("s6");
		            }
		            catch(NullPointerException e){
		                System.out.println("s7");
		            }
		            finally{
		                System.out.println("s8");
		            }
		            System.out.println("s9");
		        }
		        catch(NullPointerException e){
		            System.out.println("s10");
		        }
		        finally{
		            System.out.println("s11");
		        }
		         System.out.println("s12");
	}
}