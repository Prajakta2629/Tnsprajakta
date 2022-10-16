package org.tnsindia.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String>obj=new HashMap<>();
       obj.put(1,"Prajakta");
       obj.put(2,"Prerana");
       obj.put(3,"Sanika");
       obj.put(4,"Prachi");
       System.out.println(obj);
       for(Map.Entry m:obj.entrySet())
       {
    	   System.out.println(m.getKey()+" "+m.getValue());
       }
	}

}
