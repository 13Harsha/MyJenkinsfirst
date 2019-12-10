package practice;
import java.util.*; 
import java.lang.*; 
  
public class Harsha { 
  
    
    public static HashMap<Integer, String> sortByValue(HashMap<Integer , String> ma) 
    { 
       List<Map.Entry<Integer, String> > list = 
               new LinkedList<Map.Entry<Integer,String> >(ma.entrySet()); 
       Collections.sort(list, new Comparator<Map.Entry<Integer , String> >() { 
            public int compare(Map.Entry< Integer,String> o1,  
                               Map.Entry< Integer,String> o2) 
            { 
        } 
        return temp; 
    } 
    public static void main(String[] args) 
    { 
  
        

        
       
        Map<Integer , String> m = sortByValue(map); 
        for (Map.Entry<Integer , String> en : m.entrySet()) { 
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        } 
    } 
} 