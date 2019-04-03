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
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<Integer , String> temp = new LinkedHashMap<Integer,String>(); 
        for (Map.Entry< Integer,String> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    public static void main(String[] args) 
    { 
  
        HashMap<Integer , String> map = new HashMap<Integer,String>(); 
        map.put(10, "Java");
        map.put(20, "C");
        map.put(30, "Python");
        map.put(40, "React");
        map.put(50, "Oracle");

        
       
        Map<Integer , String> m = sortByValue(map); 
        for (Map.Entry<Integer , String> en : m.entrySet()) { 
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        } 
    } 
} 