/*SEARCH ENGINE PROJECTS 3-5
 *GROUP MEMBERS:
 *Eddie Talavera
 *Joaquian Rojas Chang
 *Anthony Brown
 *
 *COP-2805C-36113 Java Advanced*/

package cop2805;
import javax.swing.table.AbstractTableModel;
import java.io.File;
import java.util.*;

public class DBModel extends AbstractTableModel {
    private Model SearchModel;
    private List<FileDoc> results;

    enum Col {ID, NAME, EXISTENCE, MODIFIED}

    public DBModel() {
        SearchModel = new Model();
        List<FileDoc> results = SearchModel.getFile();
        this.results = results;
    }
    @Override
    public int getColumnCount() {
        return Col.values().length;
    }
    @Override
    public int getRowCount() {
        return results.size();
    }
    @Override
    public Object getValueAt(int row, int col) {
        Col column = Col.values()[col];
        FileDoc filedoc = results.get(row);
        switch (column) {
            case ID:
                return filedoc.getFileID();
            case NAME:
                return filedoc.getFileName();
            case EXISTENCE:
                return filedoc.isExistence();
            case MODIFIED:
                return filedoc.getModified();
        }
        return FileDoc.class;
    }
    @Override
    public String getColumnName(int col) {
        Col column = Col.values()[col];
        return column.toString();
    }
    public void addRow(FileDoc filedoc) {
        results.add(filedoc);
        fireTableRowsInserted(results.size() - 1, results.size() - 1);
    }
    public void rmRow(int row){
        results.remove(row);
        fireTableRowsDeleted(row,row);
    }
    public void regen(){
        for(int i = 0; i < results.size();i++) {
            FileDoc tempFileDoc = results.get(i);
            String filepath = tempFileDoc.getFileName();
            File tempFile = new File(filepath);
            boolean exists = tempFile.exists();
            tempFileDoc.setExistence(exists);
            if(exists==false)
                rmRow(i);
        }
        fireTableDataChanged();
    }
}

