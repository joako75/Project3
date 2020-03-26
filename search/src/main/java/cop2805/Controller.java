package cop2805;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller{
   private OuterFrame SearchView;
   private Model SearchModel;

   public Controller(OuterFrame SearchView,Model SearchModel){
       this.SearchView = SearchView;
       this.SearchModel = SearchModel;
       this.SearchView.addCloseButtonListener(new CloseListener());
       this.SearchView.addIndexButtonListener(new IndexListener());

   }
   class CloseListener implements ActionListener{
       public void actionPerformed(ActionEvent e){System.exit(0);}
   }
   class IndexListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
        SearchView.openIndexWindow();
       }
   }
}

