package cop2805;
import com.formdev.flatlaf.FlatIntelliJLaf;
public class SearchApp {
    public static void main( String args[] ){
        /*
         The main method calls on the flatLaf maven dependency to set the UI.
         Then instantiates the model, view, and controller
         */
        FlatIntelliJLaf.install();
        OuterFrame SearchView = new OuterFrame();
        Model SearchModel = new Model();
        Controller SearchController = new Controller(SearchView,SearchModel);
    }
}

