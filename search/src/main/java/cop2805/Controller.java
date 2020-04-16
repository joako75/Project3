package cop2805;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

public class Controller {
    private OuterFrame SearchView;
    private Model SearchModel;
    public Controller(OuterFrame SearchView, Model SearchModel) {
        this.SearchView = SearchView;
        this.SearchModel = SearchModel;
        this.SearchView.addIndexButtonListener(new IndexListener());
        this.SearchView.addAddButtonListener(new AddListener());
        this.SearchView.addRemoveButtonListener(new RemoveListener());//----
        this.SearchView.addAboutButtonListener(new AboutListener());
        this.SearchView.addSearchButtonListener(new SearchListener());//----
        this.SearchView.addRegenButtonListener(new RegenListener());
    }

    class IndexListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SearchView.openIndexWindow();
        }
    }
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String fileName = SearchView.getFileName();
            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());
            SearchModel.addFile(fileName, true, ts);
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int row = SearchView.DBTable.getSelectedRow();
            String fileID = SearchView.DBTable.getValueAt(row,0).toString();
            Model.rmFile(Integer.parseInt(fileID));
            OuterFrame.dbmodel.rmRow(row);
        }
    }
    class AboutListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/joako75/Project3").toURI());
                } catch (Exception d){}
            }
        }
    class SearchListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
        }
    }
    class RegenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
        }
    }
}



