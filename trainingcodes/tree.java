package trainingcodes;
import java.util.*;
import java.util.ArrayList;
public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("hi");  
		arrlist.add("Amit, how");  
		arrlist.add("you");  
		arrlist.add("do'in");  
		arrlist.add("?");  
		System.out.println(arrlist);   


		ListIterator<String> iterator = arrlist.listIterator(3);
		while (iterator.hasNext())
		{  
			String i = iterator.next();  
			System.out.println(i);  
		}  

	}
}