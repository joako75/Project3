package cop2805;

public class SearchApp {
    public static void main( String args[] ){
        OuterFrame SearchView = new OuterFrame();
        Model SearchModel = new Model();
        Controller SearchController = new Controller(SearchView,SearchModel);
    }
}

