package cop2805;

import javax.swing.table.AbstractTableModel;
import java.util.*;

public class DBModel extends AbstractTableModel {
private Model SearchModel;
private List<FileDoc> results;
enum Col { ID, NAME, EXISTENCE, MODIFIED}
String[] columnName = {"ID", "NAME","EXISTS", "MODIFIED"};
public DBModel(){
    SearchModel = new Model();
    List<FileDoc> results = SearchModel.getFile();
    this.results = results;
}

    @Override
    public int getColumnCount(){return 4;}
    @Override
    public int getRowCount(){return results.size();}
    @Override
    public Object getValueAt(int row,int col){
    Col column = Col.values()[col];
    FileDoc  filedoc = results.get(row);

    switch(column) {
        case ID:
            return filedoc.getFileID();
        case NAME:
            return filedoc.getFileName();
        case EXISTENCE:
            return filedoc.isExistence();
        case MODIFIED:
            return filedoc.getModified();
    }
        return null;
    }
    @Override
    public String getColumnName(int col){
    return columnName[col];
    }
    
    //Placeholder/example for hashmap, gathered from https://www.geeksforgeeks.org/map-interface-java-examples/
    //Not sure if this belongs in a different class.
    public static void main(String args[]) 
    { 
        Map< String,Integer> hm =  
                         new HashMap< String,Integer>(); 
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400)); 
   
        // Returns Set view      
        Set< Map.Entry< String,Integer> > st = hm.entrySet();    
   
        for (Map.Entry< String,Integer> me:st) 
        { 
            System.out.print(me.getKey()+":"); 
            System.out.println(me.getValue()); 
        } 
    } 
}