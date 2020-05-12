/*
Placeholder/example for hashmap, gathered from 
https://www.geeksforgeeks.org/map-interface-java-examples/ and edited to better fit the project.

More method information available at
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

Return values should not be 0, they are set to 0 temporarily to alleviate IDE warnings.
*/

package cop2805;

import java.util.*; 
class DBHashMap 
{ 
   public static void main(String args[]) 
   { 
       Map< String,String> hm =  
                        new HashMap< String, String>(); 
       hm.put("a", new String()); 
       hm.put("b", new String()); 
       hm.put("c", new String()); 
       hm.put("d", new String()); 
  
       // Returns Set view      
       Set< Map.Entry< String,String> > st = hm.entrySet();    
  
       for (Map.Entry< String,String> me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
   }
   
   //Associates the specified value with the specified key in this map.
   public Object put(Object key, Object value) {
	   
	   return 0;
	   
   }
   
   //Copies all of the mappings from the specified map to this map.
   public void putAll(Map map) {
	   
	   return;
   }
   
   //Removes mapping for specified key, would be used for the "Remove" button I believe.
   public Object remove(Object key) {
	   
	   return 0;
   }
   
   /*
   Returns the value to which the specified key is mapped, or null if this map contains no
   mapping for the key.
   */
   public Object get(Object key) {
	   
	   return 0;
	   
   }
   
   //Returns true if this map contains a mapping for the specified key.
   public boolean containsKey(Object key) {
	   
	   return 0;
	   
   }
   
   //Returns a Set view of the keys contained in this map.
   public Set keySet() {
	   
	   return 0;
	   
   }
   
   //Returns a Set view of the mappings contained in this map.
   public Set entrySet() {
	   
	   return 0;
	   
   }
} 