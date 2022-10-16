package org.tnsindia.map;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		   NavigableMap<String,String>obj=new TreeMap<>();
           obj.put("Tejal","Student");
           obj.put("Nia","Doctor");
           obj.put("Michell","Engineer");
           obj.put("Shiwani",null);
           System.out.println(obj);
           
           for(Map.Entry m:obj.entrySet())
           {
           	System.out.println(m.getKey()+" "+m.getValue());
           }
           System.out.println(obj.firstEntry());
           System.out.println(obj.lastEntry());
	}

}