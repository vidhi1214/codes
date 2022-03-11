package trainingcodes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

 

public class hashh{

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

     HashSet h = new HashSet();
     h.add("I am");
     h.add("hungry");
     h.add("send me");
     h.add("food");
     
//   in HashSet duplicates not allowed,insertion order is not maintained
     
     System.out.print(h);
     System.out.print(h.size());
     System.out.println(h.contains("food"));
   
    
    LinkedHashSet l = new LinkedHashSet();
    
    l.add("I am");
    l.add("hungry");
    l.add("send me");
    l.add("food");
//   in HashSet duplicates not allowed,insertion order is mainted
    
    System.out.println(l);
    
    SortedSet s = new TreeSet();
    s.add(10);
    s.add(13);
    s.add(12);
    s.add(17);
    s.add(15);
    s.add(19);
    
//   headSet,tailSet,first,last,subset
   
    System.out.println(s);
    System.out.println(s.first());
    System.out.println(s.tailSet(13));
    System.out.println(s.headSet(13));
    }

}