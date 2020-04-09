package cop2805;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.Map;

public class Index {
/* I'm still tying to figure the index 
 * 
 */
	static Map<String, SortedSet<FileDoc>> invertedIndex;
	    
	static {
	    Index.invertedIndex = new HashMap<String, SortedSet<FileDoc>>();
	}	    
}