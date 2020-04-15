package cop2805;
import com.formdev.flatlaf.FlatIntelliJLaf;
public class SearchApp {
    public static void main( String args[] ){
        FlatIntelliJLaf.install();
        OuterFrame SearchView = new OuterFrame();
        Model SearchModel = new Model();
        Controller SearchController = new Controller(SearchView,SearchModel);
    }
}

