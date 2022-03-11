package trainingcodes;

import java.util.ArrayList;
import java.util.Iterator;

public class coll {
public static void main(String args[])
{
	ArrayList a = new ArrayList();

	a.add("hello");
	a.add("bunny");
	a.add("welcome!");
	
	Iterator b = a.iterator();
			while(b.hasNext())
			{
				System.out.println(b.next());
				   
				// System.out.println(b.remove());
			}
			 
    }
}