package cop2805;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Controller {
    /*
    Gives controller class access to the view and model
     */
    private OuterFrame SearchView;
    private Model SearchModel;
/*
When the Controller object is instantiated, it will require OuterFrame and Model objects as arguments.
The arguments are set to the instantiated object and the actionListeners are added to SearchView.
 */
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


    //Event handling for the view is described by the methods within these inner classes

    /*
    Event handling for IndexJButton is described here.
     */
    class IndexListener implements ActionListener {
        /*
        The Index button in the main view will open the Maintenance view window.
         */
        public void actionPerformed(ActionEvent e) {
            SearchView.openIndexWindow();
        }
    }
    /*
    Event handling for addJButton is described here.
     */
    class AddListener implements ActionListener {
        /*
        The "add..." button in maintenance view calls on getFileName to open JFileChooser.
        JFileChooser's file selection will pass the full path of the selected file to fileName
        API method, addFile accepts the path as the filename, but uses sample data for rest of arguments
        The file existence boolean is set to true and the timestamp gets set as current time
         */
        public void actionPerformed(ActionEvent e) {
            String fileName = SearchView.getFileName();
            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());
            SearchModel.addFile(fileName, true, ts);
            SearchModel.getFile();
        }
    }
    /*
    Event handling for removeJButton is described here.
     */
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Enter a FileID to delete from database: ");
            Scanner scanner = new Scanner(System.in);
            int fileIDSelection = scanner.nextInt();
            SearchModel.rmFile(fileIDSelection);
            SearchModel.getFile();//Retrieves and prints Database to console
        }
    }
    /*
    Event handling for aboutJButton is described here.
     */
    class AboutListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/joako75/Project3").toURI());
                } catch (Exception d){}
            }
        }
    /*
    Event handling for searchJButton is described here.
     */
    class SearchListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
        }
    }
    /*
    Event handling for the regenIndexJButton is described here.
     */
    class RegenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           /* SearchModel.regenerateIndex();
            SearchModel.getFile();
            */
        }
    }

}



