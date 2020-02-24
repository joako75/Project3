package cop2805;
import java.awt.*;

//Class containing the outer frame
class OuterFrame{
OuterFrame(){
//Constructs the frame and 3 button objects
Frame frame1 = new Frame( "Search Engine" );
Button searchButton = new Button( "Search" );
Button aboutButton = new Button ( "About" );
Button indexButton = new Button ( "Index" );
Button closeButton = new Button("Close");
closeButton.addActionListener(e -> System.exit(0));

//Sets position of the buttons and adds them to the frame
searchButton.setBounds(500, 50, 80, 30);
frame1.add(searchButton);
aboutButton.setBounds(500, 425, 80, 30);
frame1.add(aboutButton);
indexButton.setBounds(400, 425, 80, 30);
frame1.add(indexButton);
closeButton.setBounds(600, 425, 80, 30);
frame1.add(closeButton);
frame1.setSize(700,500);
frame1.setLayout(null);
frame1.setVisible(true);


}

//Need a class for the inner frame (index window)

public static void main( String args[] ){
OuterFrame frame1 = new OuterFrame();
}}