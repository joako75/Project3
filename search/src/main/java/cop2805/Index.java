/*SEARCH ENGINE PROJECTS 3-5
 *GROUP MEMBERS:
 *Eddie Talavera
 *Joaquian Rojas Chang
 *Anthony Brown
 *
 *COP-2805C-36113 Java Advanced*/

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