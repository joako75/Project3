package cop2805;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.*;

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
    }
    class IndexListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SearchView.openIndexWindow();
        }
    }
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SearchView.getFileName();
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //----
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
                //----
        }
    }

}



